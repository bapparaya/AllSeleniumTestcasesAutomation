package oops;

/*inter face is to hide the implamentation and showing only functionality to the user
 * interface can have only static and final variable even if we dont specify
 * interface can have both abstruc and non abstruc methods
 * all the abstruct methods should be implamnetated in its immidiate class
 * non adbstruc methods it allows only static and default methods
 * all abstruct methods are public even though if we dont specify
 * inter face canot have contructor
 * we cannot create an object for interface
 * it allows multiple inheritance
 * interface-interface extends
 * interface to class implements
 * 
 * 
 */
interface First{
	int i = 10;
	String s ="Bappa";
	
	void showdeatils();
	
	default void printdetails() {
		System.out.println("it is printdetails"+s+i);
	}
	
	static void house() {
		System.out.println("it is bappas house");
	}
	
	
}

interface Second extends First {
	int j=20;
	String s = "Unkown";
	
	void wifedisplay();
	
//	default void showdeatils(){
//		System.out.println("it is wife details");
//	}
	
	default void wifeprint() {
		
		System.out.println("it is wifes print"+s+j);
	}
	
	static void wifehouse() {
		System.out.println("it is wife house");
	}
}
public class Demo implements Second {
	
	public void showdeatils() {
		System.out.println("it is first interface details");
	}
	
	public void wifedisplay() {
		System.out.println("it is wife dsplay");
	}
	public void wifeprint(){
		System.out.println("it is class print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Second sc = new Demo();
		sc.showdeatils();
		sc.wifedisplay();
		sc.wifeprint();
		sc.printdetails();
		//Second.house();
		Second.wifehouse();
		
//		First fs = new Demo();
//		fs.showdeatils();
//		fs.printdetails();
//		Second.wifehouse();
		

	}

}
