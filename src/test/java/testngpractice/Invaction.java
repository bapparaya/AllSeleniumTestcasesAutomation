package testngpractice;

import org.testng.annotations.Test;

public class Invaction {



@Test(invocationCount=10)
public void testLogin() {
	System.out.println("testing");
}


}
