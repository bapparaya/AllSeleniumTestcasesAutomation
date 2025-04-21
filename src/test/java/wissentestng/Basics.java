package wissentestng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {

	/*
	 * annotations, Test, Before and After, Dataprovider,Parameter, Beforegroups
	 * parameter, priority,groups,dataProviders,invocationCount
	 * Logs,Report,Testng.xml,Assertions
	 * 
	 */
	
	//123asa
	
	Logger logger = LogManager.getLogger(this.getClass());
	@BeforeGroups(groups = {"Sanity"})
	void beforegroup(){
		System.out.println("before group");
		logger.log(null, "beforegroups");
	}

	

@Parameters("browser")
@Test(priority=-1,groups={"Sanity","Regression"})
void login(String browser) {
	System.out.println("login"+browser);
	
}

@Test(priority=0,groups="Sanity",invocationCount=10)
void homepage() {
	System.out.println("homepage");
	logger.log(null, "homepage logger");
}


@Test(groups=("Regression"))
void cmr() {
	System.out.println("cmr");
}

//@Test(dataProvider="data")
//void logintwo(String user,String password) {
//	System.out.println(user+" "+password);
//}
//
//@DataProvider
//String[][] data() {
//	String[][] data = {{"Bappa","B@12"},{"Muthu","M@12"}};
//	return data;
//}



}
