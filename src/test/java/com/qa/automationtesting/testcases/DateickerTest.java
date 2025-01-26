package com.qa.automationtesting.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationpracticeUtils.Utilsmethods;
import com.qa.automationtesting.pages.AutomationTestingPracticepage;


public class DateickerTest extends BaseClass {

	AutomationTestingPracticepage ap;

@BeforeClass
@Parameters("browser")
void setup(String browser)
{
	initialize(browser);
	 ap = new AutomationTestingPracticepage();
}

@Test(priority=1)
void verifyDatePickerFuture() {
	String date1 = ap.clickOnDatePicket1();
	Assert.assertEquals(date1, "03/15/2027");
}

@Test(priority=2)
void verifyDatepicker2() {
	String date2 = ap.clickOnDatePicker2();
	Assert.assertEquals(date2, "15/03/2027");
}

//@AfterClass
//void tearDown() {
//	driver.quit();
//}



}
