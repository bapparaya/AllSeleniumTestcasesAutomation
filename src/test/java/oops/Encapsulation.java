package oops;

public final class Encapsulation {
//restricting the access of the variables for some security reasons
	
	private String s;
	private int i;
	
	public Encapsulation(String s, int i){
		this.s=s;
		this.i=i;
	}
	
	//s="ram";
	public String getString() {
		return s;
	}
//	public void setString(String s) {
//		this.s=s;
//	}
	public int gettint() {
		return i;
	}
}



