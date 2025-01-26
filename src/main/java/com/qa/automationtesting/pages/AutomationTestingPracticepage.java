package com.qa.automationtesting.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationpracticeUtils.Utilsmethods;

public class AutomationTestingPracticepage extends BaseClass {

//below are datepicker1 elements
@FindBy(xpath="//input[@id='datepicker']")
 public WebElement datepicker1;

@FindBy(xpath="//div[@class='ui-datepicker-title']/span[1]")
public  WebElement month;

@FindBy(xpath="//div[@class='ui-datepicker-title']/span[2]")
public  WebElement year;

@FindBy(xpath="//td[@data-handler='selectDay']/a")
public List<WebElement> selectdays;

@FindBy(xpath="//span[text()='Next']")
public  WebElement nextbtn;

//below are datepicker2 elements
@FindBy(xpath="//input[@id='txtDate']")
WebElement datepicker2;

@FindBy(xpath="//select[@class='ui-datepicker-year']")
WebElement selectyear;

@FindBy(xpath="//select[@class='ui-datepicker-month']")
WebElement selectmonth;

@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
List<WebElement> selectdates;




public AutomationTestingPracticepage(){
	super();
	PageFactory.initElements(driver, this);
}

public String clickOnDatePicket1() {
	Utilsmethods.scrollPageTillEmement(datepicker1);
	datepicker1.click();
	Utilsmethods.futurDateSelect("March", "2027", "15");
	return datepicker1.getAttribute("value");
	
}

public String clickOnDatePicker2() {
	try {
	datepicker2.click();
	Utilsmethods.scrollPageTillEmement(datepicker2);
	Utilsmethods.selectFromDropDown(selectyear, "2027");
	Utilsmethods.selectFromDropDown(selectmonth, "Mar");
	for(WebElement selectdate: selectdates) {
		if(selectdate.getText().equals("15")) {
			selectdate.click();
		}
	}
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	return datepicker2.getAttribute("value");

}








}
