package com.qa.automationtesting.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Actionclassmothodspage;

public class ActionclassTest extends BaseClass {

	Actionclassmothodspage acp;
@BeforeClass
@Parameters("browser")
void setUp(String browser) {
	initialize(browser);
	 acp = new Actionclassmothodspage();
}

@Test(priority=1)
void lefttorighttest() {
	//just commenting
	String amountrange = null;
	try {
	 amountrange =acp.slidefromlefttoright();
	}catch(Exception e) {
		e.printStackTrace();
	}
	Assert.assertEquals(amountrange, "$247 - $300");
}

@Test(priority=2)
void verifydraganddrop() {
	String message = acp.dragAndDrop();
	Assert.assertEquals(message, "Dropped!");
}

@Test(priority=3)
void verifyscrollDropdown() {
	String value = acp.scrollDropDown();
	Assert.assertEquals(value, "Item 40");
}

@AfterClass
void tearDown() {
	driver.quit();
}

}
