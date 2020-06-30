package pageobject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReport {
	static ExtentSparkReporter reporter;
	static ExtentReports extent;
	
	public static ExtentReports extentreportobj() {

		String path = System.getProperty("user.dir") + "\\repor\\index.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Testing");
		reporter.config().setDocumentTitle("Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Khushbu");

		return extent;
	}

}
