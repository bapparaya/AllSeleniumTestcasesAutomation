package com.qa.automationtesting.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.BaseClass;

public class Dropdownautofillpage extends BaseClass {

	@FindBy(xpath="//input[@class='wikipedia-search-input']")
	WebElement searchbox;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement searchbtn;
	
	@FindBy(xpath="//div[@id='wikipedia-search-result-link']/a")
	List<WebElement> autosuggestions;
	
	
	
	public Dropdownautofillpage(){
		super();
		PageFactory.initElements(driver,this);
	}
	
	
	public String  clickonSearch() {
		String parentwindow = driver.getWindowHandle();
		searchbox.sendKeys(prop.getProperty("searchtext"));
		searchbtn.click();
		for(WebElement suggestion:autosuggestions) {
			if(suggestion.getText().equals(prop.getProperty("findtext"))){
				suggestion.click();
			}
			else {
				System.out.println("mentioned suggestion not found...!");
			}
		}
		
	Set<String> allwindows=	driver.getWindowHandles();
	for(String window:allwindows) {
		if(!window.equals(parentwindow)) {
			driver.switchTo().window(window);
			
		}
		
	}
	return driver.getTitle();	
		
		
		
	}





}
