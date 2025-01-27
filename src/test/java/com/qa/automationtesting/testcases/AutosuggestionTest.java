package com.qa.automationtesting.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Dropdownautofillpage;

public class AutosuggestionTest extends BaseClass {

	Dropdownautofillpage aup;
	
@BeforeClass
@Parameters("browser")
void setUp(String browser) {
	initialize(browser);
	 aup = new Dropdownautofillpage();
}

@Test
void testAutofill() {
	aup.clickonSearch();
}
@AfterClass
void tearDown() {
	driver.quit();
}



}
