package com.qa.automationtesting.pages;

import org.openqa.selenium.JavascriptExecutor;
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


public String singleFileUpload() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", singlefileuploadbtn );
	//singlefileuploadbtn.click();
	singlefileuploadbtn.sendKeys("C:\\Users\\bapparayar\\Downloads\\Bapparaya 5yr automation (1).pdf");
	return singlefileuploadbtn.getAttribute("value");
}

//commenting for conflicts





}
