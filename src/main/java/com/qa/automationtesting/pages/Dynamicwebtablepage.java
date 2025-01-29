package com.qa.automationtesting.pages;

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




}
