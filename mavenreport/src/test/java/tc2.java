import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc2 extends reporter{
  @Test
  public void f() {
		  logger=extent.startTest("test case 2");
		  System.out.println("test case 2 is running");
		  logger.log(LogStatus.FAIL, "test 2 is fail");
		  extent.endTest(logger);
	  
  }
}
