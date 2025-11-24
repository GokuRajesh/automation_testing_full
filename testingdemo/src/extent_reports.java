import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extent_reports {
	
	ExtentReports extend;
	ExtentTest logger;
	
  @Test
  public void tc1() {
	  
	  logger=extend.startTest("test1");
	  assertTrue(true);
	  logger.log(LogStatus.PASS,"test1 is pass");
	  extend.endTest(logger);
	  
  }
  @Test
  public void tc2() {
	  logger=extend.startTest("test2");
	  assertTrue(false);
	  logger.log(LogStatus.PASS,"test2 is pass");
	  extend.endTest(logger);
  }
  
  @BeforeTest
  public void startTest() {
	  extend = new ExtentReports("C:\\Selenium demo\\testresults.html",true);
  }
  
  @AfterTest
  public void endTest() {
	  extend.flush();
	  extend.close();
  }
}
