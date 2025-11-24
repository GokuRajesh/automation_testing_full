import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc1 extends reporter {
  @Test
  public void f() {
	  logger=extent.startTest("test case 1");
	  System.out.println("test case 1 is running");
	  logger.log(LogStatus.PASS, "test 1 is pass");
	  extent.endTest(logger);
  }
}
