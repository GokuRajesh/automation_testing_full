import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc02 extends reporter {
  @Test
  public void f() {
	  logger=extent.startTest("test2");
	  System.out.println("test 2 is running");
	  logger.log(LogStatus.PASS, "test2 is a pass");
	  extent.endTest(logger);
  }
}
