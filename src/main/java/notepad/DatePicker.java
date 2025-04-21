package notepad;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bapparayar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement datepicker = driver.findElement(By.xpath("//input[@id='datepicker']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", datepicker);
		datepicker.click();
		String expectedmonth = "April";
		String expectedyear = "2027";
		String expecteddate = "25";

		while (true) {

			String currentmonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[1]")).getText();
			String currentyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[2]")).getText();
			if (currentmonth.equals(expectedmonth) && currentyear.equals(expectedyear)) {
				List<WebElement> dates = driver
						.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				for (WebElement date : dates) {
					if (date.getText().equals(expecteddate)) {
						date.click();
						break;
					}

				}
			} else {

				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}

		}
	}
}
