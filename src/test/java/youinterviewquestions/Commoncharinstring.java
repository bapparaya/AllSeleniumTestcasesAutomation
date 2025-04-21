package youinterviewquestions;

import java.util.HashSet;
import java.util.Set;

public class Commoncharinstring {

	public static void main(String[] args) {
		String s1="indiancriketteam";
		String s2="indianfootballteam";
		
		Set<Character> set1 = new HashSet<Character>();
		Set<Character> set2 = new HashSet<Character>();
		
		for(char c:s1.toCharArray()) {
			set1.add(c);
		}
		
		for(char d:s2.toCharArray()) {
			if(set1.contains(d)) {
				set2.add(d);
			}
			
		}
		
		System.out.println(set2);
		
		

	}

}
