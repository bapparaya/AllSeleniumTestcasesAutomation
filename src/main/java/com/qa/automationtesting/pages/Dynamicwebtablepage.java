package com.qa.automationtesting.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.automationpractice.base.BaseClass;

public class Dynamicwebtablepage extends BaseClass  {


@FindBy(xpath="//table[@id='taskTable']/tbody/tr/td[1]")
List<WebElement> sysnames;

@FindBy(xpath="//*[@id=\"rows\"]/tr[3]/td[5]")
WebElement cpuusage;

//pagination webtable elements
//@FindBy(xpath="")

//dynamic button
@FindBy(xpath="//button[contains(@name, 'st')]")
WebElement startAndStopbtn;

public Dynamicwebtablepage() {
	super();
	PageFactory.initElements(driver, this);
}

public String verifywebtable() {
	String  cpuusagevalue = "";
	for(WebElement sysname: sysnames) {
		if(sysname.getText().equals("Chrome")){
			  cpuusagevalue = cpuusage.getText();
		}
	}
	return cpuusagevalue;
}

public String loopVerifywebtable() {
	String memory="";
	for(int i=1;i<=4;i++) {
		String browser = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + i + "]/td[1]")).getText();
		System.out.println(browser);
		if(browser.equals("Chrome")) {
			 memory = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + i + "]/td[4]")).getText();
			System.out.println(memory);
		}
	}
	return memory;
}

public String verifyPagination() {
	
	String price = null;
		List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']/li"));
		for(int j=1;j<=pages.size();j++) {
			driver.findElement(By.xpath("//ul[@id='pagination']/li["+j+"]")).click();
			
			List<WebElement> totalprodperpage= driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
			for(int i=1;i<=totalprodperpage.size();i++) {
			
			String prod =	driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(prod);
			if(prod.equals("Router")) {
				By element =By.xpath("//table[@id='productTable']/tbody/tr["+i+"]/td[3]");
				 price = driver.findElement(element).getText();
				System.out.println(price);
				return price; //stop searching after finding it
			}
			
			
			
		}
			
		}
		return price;
			
}

public List<String> verifyDynamicButton() {
	String beforebtn= startAndStopbtn.getText();
	System.out.println(beforebtn);
	startAndStopbtn.click();
	String afterclkbtn = startAndStopbtn.getText();
	System.out.println(afterclkbtn);
	return Arrays.asList(beforebtn, afterclkbtn);
}




}
