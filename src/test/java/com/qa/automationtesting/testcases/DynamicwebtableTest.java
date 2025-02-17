package com.qa.automationtesting.testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.automationpractice.base.BaseClass;
import com.qa.automationtesting.pages.Dynamicwebtablepage;

public class DynamicwebtableTest extends BaseClass {

	Dynamicwebtablepage dp;
	SoftAssert sfasert = new SoftAssert();
	
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

//@Test
//void verifypaginamtiontable() {
//	String price = dp.verifyPagination();
//	Assert.assertEquals(price, "$24.99");
//}

@Test
void verifyDynamicbtn() {
	List<String> values = dp.verifyDynamicButton();
	sfasert.assertEquals(values.get(0), "START");
	sfasert.assertEquals(values.get(1), "STOP");
	sfasert.assertAll();
	}

@AfterMethod
void tearDown() {
	
}

}
