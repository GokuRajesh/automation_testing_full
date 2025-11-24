import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc03 extends reporter {
  @Test
  public void f() {
	  logger=extent.startTest("test3");
	  System.out.println("test 3 is running");
	  logger.log(LogStatus.PASS, "test3 is a pass");
	  extent.endTest(logger);
  }
}
