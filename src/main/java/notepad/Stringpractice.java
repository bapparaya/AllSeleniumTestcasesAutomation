package notepad;

public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "Bappa,raya";

	System.out.println(s.substring(1, 5));
	System.out.println(s.replace('a', 'z'));
	//String s = "Bappa,raya";
	String[] a = s.split(",");
	System.out.println(a[0] +" " + a[1]);
	
	System.out.println(s.indexOf('r'));
	System.out.println(s.replaceAll("ya", "pp"));
	
	String s2="Bzppz,rzyz";
	//String s = "Bappa,raya";
	String ovwels = "aeiou";
	
	for(int i=0;i<ovwels.length();i++) {
		char c = ovwels.charAt(i);
	if(s2.indexOf(c) != -1) {
		System.out.println("string s2 is having ovwels");
	}
	}
	
	
	
	
	
	
	}

}
