package wissen.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FramesWindowsAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bapparayar\\Desktop\\WebAutomation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement doubleclick = driver.findElement(By.xpath("//h2[text()='Double Click']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", doubleclick);
		
		WebElement upload = driver.findElement(By.id("multipleFilesInput"));
		//upload.click();
				upload.sendKeys("C:\\Users\\bapparayar\\Downloads\\img20250325_17135572.pdf\nC:\\Users\\bapparayar\\Downloads\\BapparayaSDET5yr (1).pdf");
		
		
//		WebElement textbox = driver.findElement(By.id("field1"));
//		textbox.click();
//
//		Actions ac = new Actions(driver);
//
//		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//		driver.findElement(By.id("field2")).click();
//		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

//		Actions ac = new Actions(driver);
//
//		WebElement copytext = driver.findElement(By.xpath("//button[text()='Copy Text']"));
//		ac.doubleClick(copytext).perform();
//
//		Thread.sleep(5000);
//
//		WebElement source = driver.findElement(By.id("draggable"));
//		WebElement target = driver.findElement(By.id("droppable"));
//		ac.dragAndDrop(source, target).perform();
//		// ac.drag(source)AndDrop(target).perform();
//		Thread.sleep(5000);
//		WebElement slider = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
//		ac.clickAndHold(slider);
//		ac.moveByOffset(100, 0).perform();
//		Thread.sleep(5000);
//		WebElement point = driver.findElement(By.xpath("//button[text()='Point Me']"));
//		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//
//		ac.moveToElement(point);
//		ac.moveToElement(mobile).perform();
//
//		Thread.sleep(5000);

		/*
		 * driver.get("https://www.google.com/");
		 * driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium");
		 * List<WebElement> list = driver .findElements(By.xpath(
		 * "//div[@id='Alh6id']/div/div/ul/li/div/div[2]/div[1]/div[1]/span[1]")); for
		 * (WebElement list1 : list) { if (list1.getText().equals("selenium download"))
		 * { list1.click(); }
		 * 
		 * }
		 */

		/*
		 * driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		 * 
		 * WebElement frame = driver.findElement(By.id("frm1"));
		 * driver.switchTo().frame(frame); WebElement dropdown =
		 * driver.findElement(By.id("selectnav1")); Select sl = new Select(dropdown);
		 * sl.selectByVisibleText("- Telugu"); driver.switchTo().defaultContent();
		 * 
		 * driver.findElement(By.id("name")).sendKeys("Bappa");
		 * driver.navigate().refresh(); driver.navigate().back(); Thread.sleep(3000);
		 * String parentwindow = driver.getWindowHandle();
		 * driver.findElement(By.id("PopUp")).click(); Set<String>
		 * allwindows=driver.getWindowHandles();
		 * 
		 * for(String window:allwindows) { driver.switchTo().window(window);
		 * if(driver.getTitle().equals("Selenium")) { System.out.println("121212");
		 * driver.findElement(By.linkText("Join us!")).click(); }else { driver.close();
		 * } }
		 */

	}
	
	

}
