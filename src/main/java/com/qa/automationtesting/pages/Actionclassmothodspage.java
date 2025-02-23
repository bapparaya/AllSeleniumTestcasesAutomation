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

//drag and drop elements
@FindBy(xpath="//div[@id='draggable']")
WebElement drag;

@FindBy(xpath="//div[@id='droppable']")
WebElement drop;

//scrolling using actionclass
@FindBy(xpath="//input[@id='comboBox']")
WebElement dropdown;

@FindBy(xpath="//div[@id='dropdown']/div[40]")
WebElement item40;

public Actionclassmothodspage() {
	super();
	PageFactory.initElements(driver, this);
}

public String  slidefromlefttoright() throws InterruptedException {
	//this is actionpage checking for conflict
	Utilsmethods.scrollPageTillEmement(startslider);
	Thread.sleep(1000);
	Actions ac = new Actions(driver);
	ac.clickAndHold(startslider).moveByOffset(100, 0).perform();
	return amountrange.getAttribute("value");
	
}

public String dragAndDrop() {
	Utilsmethods.scrollPageTillEmement(drag);
	Actions action = new Actions(driver);
	action.dragAndDrop(drag, drop).perform();
	return drop.getText();
}

public String scrollDropDown() {
	Utilsmethods.scrollPageTillEmement(dropdown);
	dropdown.click();
	Actions action = new Actions(driver);
	action.scrollToElement(item40).perform();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	item40.click();
	
	return dropdown.getAttribute("value");
}


}
