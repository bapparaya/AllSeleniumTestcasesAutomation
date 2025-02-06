package com.qa.automationtesting.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Dynamicwebtablepage;

public class DynamicwebtableTest extends BaseClass {

	Dynamicwebtablepage dp;
	
@BeforeMethod
@Parameters("browser")
void setUp(String browser) {
	initialize(browser);
	dp = new Dynamicwebtablepage();
}

//@Test
//void verifydynamictable() {
//	String value = dp.verifywebtable();
//	Assert.assertEquals(value, "0.0%");
//}

//@Test
//void loopverify() {
//	String memory = dp.loopVerifywebtable();
//	Assert.assertEquals(memory, "93.7 MB");
//}

@Test
void verifypaginamtiontable() {
	String price = dp.verifyPagination();
	Assert.assertEquals(price, "$24.99");
}
@AfterMethod
void tearDown() {
	
}

}
