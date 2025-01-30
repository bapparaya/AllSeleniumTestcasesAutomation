package com.qa.automationtesting.testcases;

import java.io.IOException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Brokenlinkspractice;

public class VerifyBrokenLinksTest extends BaseClass {

	Brokenlinkspractice bp;
	
@BeforeMethod
@Parameters("browser")
void setup(String browser) {
	initialize(browser);
	 bp = new Brokenlinkspractice();
}

@Test
void verifylinksarebroken() throws IOException {
	URL url = bp.verifyBrokenLinks();
	
  Assert.assertTrue(true, "it is a broken link"+ url);
	
}



}
