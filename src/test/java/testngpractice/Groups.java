package testngpractice;
import org.testng.annotations.*;

public class Groups {

	@BeforeMethod(groups= {"Sanity","Regression","Master"})
	void setUp() {
		System.out.println("setup all the browser session and open the url");
	}
	
	@Test(priority=1,groups= {"Sanity","Master"})
	void verifylogin() {
		System.out.println("login verified");
	}
	@Test(priority=2,groups= {"Sanity","Regression","Master"})
	void verifyHomepage() {
		System.out.println("homepage verified");
	}
	@Test(priority=3,groups= {"Regression", "Master"})
	void addCartpage() {
		System.out.println("add cart page verified");
	}
	
	@AfterMethod (groups= {"Sanity","Regression","Master"})
	void tearDown() {
		System.out.println("close all the browser sesesion");
	}
	
	
}
