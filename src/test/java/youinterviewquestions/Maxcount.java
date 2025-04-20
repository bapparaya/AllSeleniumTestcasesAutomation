package youinterviewquestions;

public class Maxcount {

	public static void main(String[] args) {
		int[] a= {11,4,2,6,9,7,8};
		
		int max =a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println(max);
		
	}

}
