package utils;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public static ExtentReports setupExtentReport() {
        // Define the report path
    	//System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties")
        String reportPath = System.getProperty("user.dir") + "\\testReports\\ExtentReport.html";
        

        // Configure the ExtentSparkReporter
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
        sparkReporter.config().setReportName("Automation Test Report");
        sparkReporter.config().setDocumentTitle("Test Report");

        // Initialize ExtentReports and attach the reporter
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // Add system information
        extent.setSystemInfo("Tester", "Bapparaya R");
        extent.setSystemInfo("Environment", "QA");

        return extent;
    }

    public static ExtentTest createTest(String testName) {
        // Create a new test and associate it with ThreadLocal
        ExtentTest test = extent.createTest(testName);
        extentTest.set(test);
        return test;
    }

    public static ExtentTest getTest() {
        // Retrieve the current test associated with the thread
        return extentTest.get();
    }

    public static void flushReport() {
        if (extent != null) {
            extent.flush();
        }
        // Automatically open the report after flushing
        try {
            String reportPath = System.getProperty("user.dir") + "\\testReports\\ExtentReport.html";
            System.out.println("Report will be saved at: " + reportPath);
            File reportFile = new File(reportPath);
            if (reportFile.exists()) {
                java.awt.Desktop.getDesktop().browse(reportFile.toURI());
            } else {
                System.out.println("Report file not found at: " + reportPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
