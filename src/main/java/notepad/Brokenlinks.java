package notepad;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bapparayar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			if (url == null || url.isEmpty()) {
				System.out.println("Skipping empty or null URL");
				continue;
			}
			try {
				URL urls = new URL(url);
				HttpURLConnection hup = (HttpURLConnection) urls.openConnection();
				hup.setRequestMethod("HEAD");
				int response = hup.getResponseCode();
				if (response > 400) {
					System.out.println(urls + "is abrokenlink");
				} else {
					System.out.println(urls + "it is not a broken link");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
