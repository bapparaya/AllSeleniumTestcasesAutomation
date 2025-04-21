package youinterviewquestions;

import java.util.Arrays;

public class Reverseafter {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		int k=3;
		
		System.out.println(a[k]);
		
		int left=k;
		int right=a.length-1;
		
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(a));

	}

}
