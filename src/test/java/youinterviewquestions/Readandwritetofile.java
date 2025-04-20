package youinterviewquestions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Readandwritetofile {

	public static void main(String[] args) throws IOException {
	  Properties prop = new Properties();
	  prop.setProperty("username", "Bapparaya");
	  
      FileOutputStream op = new FileOutputStream("E:\\B1java\\AutomationTestingPracticeWebsite\\src\\test\\java\\youinterviewquestions\\Config.txt");
      prop.store(op, "Config Properties");
     
     
     Properties readprop = new Properties();
     FileInputStream ip = new FileInputStream("E:\\B1java\\AutomationTestingPracticeWebsite\\src\\test\\java\\youinterviewquestions\\Config.txt");
     readprop.load(ip);
     System.out.println(readprop.getProperty("username"));
      
	}

}
