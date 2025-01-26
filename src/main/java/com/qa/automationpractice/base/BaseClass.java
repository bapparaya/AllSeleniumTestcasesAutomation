package com.qa.automationpractice.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass {

	public static WebDriver driver;

public void initialize(String browser){
	if(browser.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	}else if(browser.equals("edge")) {
		driver = new EdgeDriver();
	}else {
		System.out.println("oops...invalid browser please provide valid browser ): ");
	}
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
}



}
