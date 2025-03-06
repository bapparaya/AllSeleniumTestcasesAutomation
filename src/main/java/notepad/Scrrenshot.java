package notepad;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bapparayar\\Downloads\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\bapparayar\\git\\AllSeleniumTestcasesAutomation\\src\\main\\java\\notepad\\scrrenshot.png");
//		source.renameTo(destination);
		
		
//		TakesScreenshot sc = (TakesScreenshot) driver;
//		File source = sc.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\bapparayar\\git\\AllSeleniumTestcasesAutomation\\src\\main\\java\\notepad\\scrrenshot.png");
//		source.renameTo(destination);
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("");

		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", date);
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
//		js.executeScript("window.scrollTo(0,800)");11








		}
}
