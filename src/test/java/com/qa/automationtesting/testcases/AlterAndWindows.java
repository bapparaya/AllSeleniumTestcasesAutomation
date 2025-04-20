package com.qa.automationtesting.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Alertsandwindowhandles;

public class AlterAndWindows extends BaseClass {

	Alertsandwindowhandles awh;
	
@BeforeTest
@Parameters("browser")
void setup(String browser) {
	initialize(browser);
	awh = new Alertsandwindowhandles();
}

//@Test(priority=1)
//void verifySimpleAlert() {
//	String message = awh.verifySimpleAlert();
//	Assert.assertEquals(message, "I am an alert box!");
//}
//
//@Test(priority=2)
//void verifyConfirmationAlert() {
//	String message = awh.verifyConfirmation();
//	Assert.assertEquals(message, "Press a button!");
//}

@Test(priority=3)
void verifyPrompt() throws InterruptedException {
	 awh.verifyPromt();
}
//@AfterTest
//void tearDown() {
//	
//}






}
