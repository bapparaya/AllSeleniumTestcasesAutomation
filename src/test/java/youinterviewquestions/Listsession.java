package youinterviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Listsession {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();	
		
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list1.add(4);
		
//		System.out.println(list1);
//		
//		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,7,8,9,10));
//		
//		System.out.println(list2);
//		
//		list1.addAll(list2);
//		System.out.println(list1);
		
//		list1.removeAll(list2);
//		System.out.println(list1);
		
//		list1.retainAll(list2);
//		System.out.println(list1);
		//System.out.println(list1.isEmpty());
		if(!list1.isEmpty()) {
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i));
			
		}
		}else {
			//System.out.println(list1.isEmpty());
			System.out.println("array list doesnot have any values");
		}
		
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4,6,8,1,4));
		
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		
		
		
		
	
	
	}

}
