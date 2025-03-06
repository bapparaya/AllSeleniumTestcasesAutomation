package notepad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingwindow {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bapparayar\\Downloads\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
//	WebElement simpleAlert = driver.findElement(By.xpath("//button[@id='alertBtn']"));
//	simpleAlert.click();
//	Thread.sleep(2000);
//	driver.switchTo().alert().accept();
//	WebElement confirmationAlert = driver.findElement(By.xpath("//button[@id='confirmBtn']"));
//	confirmationAlert.click();
//	Thread.sleep(2000);
//	driver.switchTo().alert().dismiss();
	WebElement promtAlert = driver.findElement(By.xpath("//button[@id='promptBtn']"));
	promtAlert.click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("bappa");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();

	
	
	
}




}
