package youinterviewquestions;

import java.util.Arrays;

public class Replaceallindex {

	public static void main(String[] args) {
	
     int[] a= {2,4,6,1,3,5,7,8,9};
     
     System.out.println(Arrays.toString(a));
     int temp=a[0];
     
     for(int i=0;i<a.length-1;i++) {
    	 a[i]=a[i+1];
     }
     
     a[a.length-1]=temp;
     
     System.out.println(Arrays.toString(a));
     
     
     
	}

}
