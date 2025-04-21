package com.qa.automationtesting.testcases;
/*
 * selenium
broken liks
calender 
webtables
frames
documents
windows
alerts

 */

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumpractice {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.navigate().to("https://www.makemytrip.com/flights/");

		// Click on the body or any empty space to remove the login popup
		Actions actions = new Actions(driver);
		actions.moveByOffset(10, 10).click().build().perform();

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement close=
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='SW']/div[1]/div[2]/div[2]/div/section/span")));
		// close.click();

		String expected_month_year = "August 2025";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div/div/div[2]/div[1]/div[3]/label/p[1]"))
				.click();
		boolean monthFound = false;

		while (true) {
		    List<WebElement> captions = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']"));

		    for (WebElement caption : captions) {
		        String text = caption.getText();
		        System.out.println("Visible month: " + text);
		        System.out.println("Caption Text: [" + text + "]");
		        System.out.println("Expected Text: [" + expected_month_year + "]");

		        // Normalize whitespace and trim
		        if (text.replaceAll("\\s+", " ").trim().equals(expected_month_year.trim())) {
		            System.out.println("Month matched! Searching for max price...");

		            // Find all prices and calculate max price
		            List<WebElement> prices = driver.findElements(By.xpath(
		                "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div/div/p[2]"));
		            int max = 0;
		            for (WebElement price : prices) {
		                String priceText = price.getText().replace(",", "");
		                try {
		                    int pric = Integer.parseInt(priceText);
		                    if (pric > max) {
		                        max = pric;
		                    }
		                } catch (NumberFormatException e) {
		                    System.out.println("Invalid price format: " + priceText);
		                }
		            }
		            System.out.println("Maximum price: " + max);

		            // Set monthFound to true to indicate we found the expected month
		            monthFound = true;
		            break;  // Exit the for loop
		        }
		    }

		    // If monthFound is true, break out of the while loop
		    if (monthFound) {
		        break;  // Exit the while loop
		    }

		    // If the expected month is not found, handle the popup
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    try {
		        WebElement popupClose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		            "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")));
		        popupClose.click();
		    } catch (Exception e) {
		        System.out.println("Popup not found or already closed.");
		    }
		}


			// List<WebElement> atags = driver.findElements(By.tagName("a"));
			//
			// for (WebElement tag : atags) {
			// String urls = tag.getAttribute("href");
			// if (urls != null) {
			// URL url = new URL(urls);
			// HttpURLConnection htp = (HttpURLConnection) url.openConnection();
			// htp.setRequestMethod("HEAD");
			// int code = htp.getResponseCode();
			// if (code > 400) {
			// System.out.println(url + "brokenlink");
			//
			// }
			//
			// }
			// }

		}

	}

