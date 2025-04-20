package com.qa.automationtesting.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.BaseClass;

public class Alertsandwindowhandles extends BaseClass {

@FindBy(xpath="//button[@id='alertBtn']")
WebElement simplealert;

@FindBy(xpath="//button[@id='confirmBtn']")
WebElement confirmation;

@FindBy(xpath="//button[@id='promptBtn']")
WebElement promptbtn;

public Alertsandwindowhandles() {
	super();
	PageFactory.initElements(driver, this);
}

public String  verifySimpleAlert() {
	simplealert.click();
	String alertmsg = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	return alertmsg;
}

public String verifyConfirmation() {
	confirmation.click();
	String message = driver.switchTo().alert().getText();
	driver.switchTo().alert().dismiss();
	return message;
}

public void verifyPromt() throws InterruptedException {
	try {
	promptbtn.click();
	Thread.sleep(5000);
	Alert promt = driver.switchTo().alert();
			promt.sendKeys("bappa");
	//String value = promptbtn.getAttribute("value");
	Thread.sleep(5000);
	//System.out.println(value);
	driver.switchTo().alert().accept();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}




}
