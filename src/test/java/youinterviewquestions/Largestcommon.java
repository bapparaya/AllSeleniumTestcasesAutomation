package youinterviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import io.netty.util.internal.SystemPropertyUtil;

public class Largestcommon {

	public static void main(String[] args) {
		//String[] a = {"flower", "flow", "flight"};
		
//		int minlength = 0 ;
//		for(int i=0;i<a.length;i++) {
//			if(a[i].length()<minlength) {
//				
//			}
//		}
		
//		for(int i=0;i<3;i++) {
//			if(a[i].substring(0,i).equals(a[i+1].substring(0,i) )) {
//				if(a[i].substring(0,i).equals(a[i+2].substring(0,i))){
//				System.out.println(a[i].substring(0,i));
//				}
//			}
//		}
		
//		String prefix = a[0];
//		for(int i=1;i<a.length;i++) {
//			while(!a[i].startsWith(prefix)) {
//				prefix = prefix.substring(0, prefix.length()-1);
//			}
//		}
//		System.out.println(prefix);
		
//		int[] a = {1,4,7,9,2,6};
//		int b[] = new int[a.length];
//		
//		for(int i=a.length-1;i>=0;i--) {
//			b[b.length-i-1]=a[i];
//			
//		}
//		System.out.println(Arrays.toString(b));
		
		int[] a = {1,4,7,9,2,6,0,3,100};
		
//		int left=0;
//		int right=a.length-4;
//		
//		while(left<right) {
//			int temp=a[left];
//			a[left]=a[right];
//			a[right]=temp;
//			left++;
//			right--;
//		}
//		
//		System.out.println(Arrays.toString(a));
		
//		for(int i=0;i<a.length-1;i+=3) {
//			int[] b= Arrays.copyOfRange(a, i, Math.min(i+3, a.length));
//			System.out.println(Arrays.toString(b));
//		}
		
//		int max=a[0];
//		int[] b = new int[a.length];
//		for(int j=0;j<a.length;j++) {
//		for(int i=0;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//				b[i]=max;
//				
//				a[i]=0;
//			}
//		}
//		}
//		
//		
//		
//		System.out.println(Arrays.toString(b));
		
//		String s = "Bapparaya is a blady idiot";
//		String rev ="";
		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev = rev+s.charAt(i);
//		}
//		
//		System.out.println(rev);
//		String[] b = s.split(" ");
//		for(int i=b.length-1;i>=0;i--) {
//			rev=rev+b[i]+" ";
//		}
//		System.out.println(rev);
//		}
		
		
//		String s1 ="cricket";
//		String s2 ="india";
//		
//		Set<Character> set1 = new HashSet<Character>();
//		for(char c:s1.toCharArray()) {
//			set1.add(c);
//		}
//		
//		Set<Character> set2 = new HashSet<Character>();
//		
//		for(char c2:s2.toCharArray()) {
//			if(set1.contains(c2)) {
//			set2.add(c2);
//			}
//		}
//		
//   System.out.println(set2);

	
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("Cat", 3);
	map.put("Apple", 1);
	map.put("orange", 4);
	map.put("Banana", 2);
	map.put(null, 0);
	System.out.println(map);
	
	
	Map<String, Integer> map2 = new TreeMap<String, Integer>();
	int nullvaue=0;
	for(Entry<String, Integer> entry: map.entrySet()) {
		if(entry.getKey()==null) {
			nullvaue = entry.getValue();
		}else {
			map2.put(entry.getKey(), entry.getValue());
		}
	}
	System.out.println(map2);
	
	Map<String, Integer> map3= new LinkedHashMap<String,Integer>(map2);
	map3.put(null, nullvaue);
	System.out.println(map3);
	
	
	
	
	
	
	
	
	}	

}
