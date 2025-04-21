package youinterviewquestions;

import java.util.ArrayList;
import java.util.List;

import org.bouncycastle.util.Arrays;

public class Subarray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int k=3;
		
		int[] b= Arrays.copyOfRange(a, 0, 3);
		
//		for(int c:b) {
//			System.out.println(c);
//		}
		
		//List<int[]> list = new ArrayList<int[]>();
		for(int i=0;i<a.length;i+=k) {
			int[] c = Arrays.copyOfRange(a, i, Math.min(i+k, a.length));
			//list.add(c);
			for(int p:c) {
				System.out.println(p);
			}
			System.out.println("===========");
		}
		
//		System.out.println(list);
//		
//		for(int[] z:list) {
//			System.out.println(Arrays.toString());
//		}
		
		

	}

}
