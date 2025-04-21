package utils;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class TestListener implements ITestListener {
    //private WebDriver driver; // Use Dependency Injection or WebDriverManager to initialize
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    
    public void onStart(ITestContext context) {
	    System.out.println("onstart");
	    ExtentManager.setupExtentReport();
	    
	  }
 
    @Override
    public void onTestStart(ITestResult result) {
        ExtentManager.createTest(result.getMethod().getMethodName());
        ExtentManager.getTest().log(Status.INFO, "Test Started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentManager.getTest().log(Status.PASS, "Test Passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentManager.getTest().log(Status.FAIL, "Test Failed: " + result.getMethod().getMethodName());
        ExtentManager.getTest().log(Status.FAIL, result.getThrowable().getMessage());

        // Capture screenshot
//        try {
//            String screenshotPath = captureScreenshot(result.getName());
//            ExtentManager.getTest().addScreenCaptureFromPath(screenshotPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
//        try {
//            String screenshotPath = new BaseTest().captureScreenshot(result.getName());
//            ExtentManager.getTest().addScreenCaptureFromPath(screenshotPath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentManager.getTest().log(Status.SKIP, "Test Skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentManager.flushReport();
    }
    @Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onFinish");
	  }

    @Override
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    System.out.println("onFinish");
	  }

  /*  private String captureScreenshot(String testName) throws IOException {
    	TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		String targetpath = System.getProperty("user.dir") + "\\testReports\\screenshots\\" + testName + ".png";
		File target = new File(targetpath);
//		System.out.println(System.getProperty("user.dir"));
    	//FileUtils.copyFile(source, target);
		source.renameTo(target);
		return targetpath;
//        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        String screenshotPath = System.getProperty("user.dir") + "\\testReports\\screenshots\\" + testName + ".png";
//        System.out.println(screenshotPath);
//        FileUtils.copyFile(srcFile, new File(screenshotPath));
//        return screenshotPath;
    }*/
    
}
