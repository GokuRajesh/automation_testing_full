package exercise_reporter;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class reporter {
	public static ExtentReports extent;
	public static ExtentTest logger;
 
  @BeforeSuite
  public void beforeSuite() {
	 extent=new ExtentReports("C:\\Selenium demo\\reports_Exercise.html",true);
  }

  @AfterSuite
  public void afterSuite() {
	  extent.flush();
	  extent.close();
  }

}
