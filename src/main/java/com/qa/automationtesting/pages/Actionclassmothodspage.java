package com.qa.automationtesting.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationpracticeUtils.Utilsmethods;

public class Actionclassmothodspage extends BaseClass {

@FindBy(xpath="//div[@id='slider-range']/span[1]")
WebElement startslider;

@FindBy(xpath="//input[@id='amount']")
WebElement amountrange;

public Actionclassmothodspage() {
	super();
	PageFactory.initElements(driver, this);
}

public String  slidefromlefttoright() throws InterruptedException {
	Utilsmethods.scrollPageTillEmement(startslider);
	Thread.sleep(1000);
	Actions ac = new Actions(driver);
	ac.clickAndHold(startslider).moveByOffset(100, 0).perform();
	return amountrange.getAttribute("value");
	
}


}
