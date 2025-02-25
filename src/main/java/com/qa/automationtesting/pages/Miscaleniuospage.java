package com.qa.automationtesting.pages;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.BaseClass;

public class Miscaleniuospage extends BaseClass {


@FindBy(id="singleFileInput")
WebElement singlefileuploadbtn;

public Miscaleniuospage(){
	super();
	PageFactory.initElements(driver, this);
}

//open the new tab and switch then open the new url
public String openNewTab() {
JavascriptExecutor js = (JavascriptExecutor) driver;
String parentid = driver.getWindowHandle();
System.out.println(parentid);
js.executeScript("window.open()");
Set<String> windows = driver.getWindowHandles();
for(String window: windows) {
	if(!window.equals(parentid)) {
		driver.switchTo().window(window);
		System.out.println(window);
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
}
return null;
}


public String singleFileUpload() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", singlefileuploadbtn );
	//singlefileuploadbtn.click();
	singlefileuploadbtn.sendKeys("C:\\Users\\bapparayar\\Downloads\\Bapparaya 5yr automation (1).pdf");
	return singlefileuploadbtn.getAttribute("value");
}





}
