package youinterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print numbers from 1 to N:

If divisible by 3 – print "Fizz"

If divisible by 5 – print "Buzz"

If both – print "FizzBuzz"
		 */

//  for(int i=1;i<=20;i++) {
//	  if(i%3==0 && i%5!=0) {
//		  System.out.println("Fizz" +i);
//	  }else if(i%5==0 && i%3!=0) {
//		  System.out.println("Buzz" +i);
//	  }else if (i%3==0 && i%5==0){
//		 System.out.println("FizzBuzz"+i); 
//	  }
		
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6));
		
		list1.retainAll(list2);
		System.out.println(list1);
  }

				
		
	}


