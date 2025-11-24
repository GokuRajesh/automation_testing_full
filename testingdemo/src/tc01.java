import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc01 extends reporter {
  @Test
  public void f() {
	  logger=extent.startTest("test1");
	  System.out.println("test 1 is running");
	  logger.log(LogStatus.PASS, "test1 is pass");
	  extent.endTest(logger);
  }
}
