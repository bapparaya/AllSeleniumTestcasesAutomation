package oops;

import org.apache.commons.lang3.RandomStringUtils;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// int a=10;
// Integer x=a;
// System.out.println(x);
// 
// Integer z=100;
// int b=z;
// System.out.println(b);
		
		
		StringBuilder s = new StringBuilder("Bappa");
		
		for(int i=0;i<5;i++) {
			s=s.append(RandomStringUtils.randomNumeric(2));
			//s=s+RandomStringUtils.randomNumeric(2);
			System.out.println(s);
		}
		
		System.out.println("final string is"+ s);
//		String p = s.reverse().toString();
//		System.out.println(p);
		System.out.println(s.reverse());
		 
	}

}
