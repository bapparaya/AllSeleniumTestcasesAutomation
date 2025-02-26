package com.qa.automationpractice.base;

import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\qa\\automationtesting\\config\\configelements.txt");
			prop.load(fp);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(System.getProperty("user.dir"));

	}


	public void initialize(String browser) {

		if (prop.getProperty("executionenv").equals("local")) {
			if (browser.equals("chrome")) {
				// System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA
				// R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if (browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			} else {
				System.out.println("oops...invalid browser please provide valid browser ): ");
			}

		}

		if (prop.getProperty("executionenv").equals("Seleniumgrid")) {
			DesiredCapabilities capabalities = new DesiredCapabilities();
			if (browser.equals("chrome")) {
				capabalities.setBrowserName("chrome");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--headless");
				options.addArguments("--disable-software-rasterizer");
				options.addArguments("--disable-gpu");
				options.addArguments("--disable-dev-tools");
				options.addArguments("--disable-features=VizDisplayCompositor");
			} else if (browser.equals("edge")) {
				capabalities.setBrowserName("MicrosoftEdge");
			}
			try {
				driver = new RemoteWebDriver(new URL("http://3.108.219.102:4444/wd/hub"), capabalities);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");


	}

}
