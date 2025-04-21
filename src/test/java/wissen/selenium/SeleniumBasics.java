package wissen.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bapparayar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement dynamic_table = driver.findElement(By.cssSelector("#HTML8"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", dynamic_table);

		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//li/a"));
		boolean productFound = false;

		for (WebElement page : pages) {
			page.click();

			List<WebElement> products = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));

			for (WebElement product : products) {

				if (product.getText().equals("Fitness Tracker")) {

		            WebElement checkbox = product.findElement(By.xpath("./parent::tr/following-sibling::tr[1]//input[@type='checkbox']"));
		            checkbox.click();
		            productFound = true;
					break;

				}

			}
			 if (productFound) {
			        break; // break the pagination loop
			    }

		}
	

		// driver.findElement(By.cssSelector("textarea[id='textarea']")).sendKeys("Bappa
		// is a idiot");

		// driver.findElement(By.cssSelector("textarea[id='textarea']")).getAttribute("");

//		WebElement malecheckbox=driver.findElement(By.id("male"));
//		System.out.println(malecheckbox.isSelected());
//
//		System.out.println(malecheckbox.isDisplayed());
//
//		System.out.println(malecheckbox.isEnabled());
//
//		//System.out.println(malecheckbox.is);
//		boolean a=malecheckbox.isSelected();
//
//		if(a!=true){
//		malecheckbox.click();

//		driver.findElement(By.xpath("//*[@id='tuesday']")).click();
//		List<WebElement> days = driver.findElements(By.xpath("//label[@for='days']//following-sibling::div/input"));
//
//		for (WebElement day : days) {
//
//			//if (day.isSelected() == true) {
//				day.click();
//			//}
//
//		}

//		WebElement dropdown = driver.findElement(By.id("country"));
//		Select sl = new Select(dropdown);
//		sl.selectByVisibleText("India");
//		//sl.selectByIndex("");
//		//sl.selectByValue("");
//		Thread.sleep(3000);
//		//sl.deselectByVisibleText("India");

//		WebElement alert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
//
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", alert);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent()).click();
//		
//		FluentWait<WebElement> wait = new FluentWait<WebElement>((WebElement) driver);
//		wait.withTimeout(Duration.ofSeconds(10));
//		wait.pollingEvery(3);

//WebElement alert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
//alert.click();
//
//Alert alert2 = driver.switchTo().alert();
//System.out.println(alert2.getText());
//alert2.accept();

//WebElement alert = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
//alert.click();
//
//Alert alert2 = driver.switchTo().alert();
//System.out.println(alert2.getText());
//alert2.sendKeys("bappa");
//alert2.accept();

//		String parentwindow = driver.getWindowHandle();
//		WebElement popup= driver.findElement(By.xpath("//button[text()='Popup Windows']"));
//		popup.click();
//
//		Set<String> allwindows = driver.getWindowHandles();
//
//		for(String window:allwindows){
//		driver.switchTo().window(window);
//		String title = driver.getTitle();
//		if(title.equals("Selenium")){
//		driver.findElement(By.xpath("//a[@class='selenium-button selenium-webdriver text-uppercase fw-bold']")).click();
//		}
//		//driver.close();
//		}
//		

	}
}
