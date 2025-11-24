import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class reporter {
	
	public static ExtentReports extent;
	public static ExtentTest logger;
  @BeforeSuite
  public void beforeTest() {
	  extent=new ExtentReports("C:\\Selenium demo\\orangehrm_maven\\exttent_reports\\reports.html",true);
  }

  @AfterSuite
  public void afterTest() {
	  extent.flush();
	  extent.close();
  }

}
