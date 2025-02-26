package com.qa.automationtesting.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Miscaleniuospage;

public class Miscaleniuostest extends BaseClass{

	Miscaleniuospage mp;

@BeforeTest
@Parameters("browser")
void setup(String browser) {
	initialize(browser);
	 mp = new Miscaleniuospage();
}

//@Test
//void verifySingleFileUpload() {
//	String filename = mp.singleFileUpload();
//	Assert.assertEquals(filename, "C:\\fakepath\\Bapparaya 5yr automation (1).pdf");
//}

//commiting for conflict 2 change
@Test
void verifyNewTab() {
	String titleFacebook = mp.openNewTab();
	System.out.println(titleFacebook);
	System.out.println(titleFacebook);
}
//commenting for conflicts11
@AfterTest
void tearDown() {
	
}





}
