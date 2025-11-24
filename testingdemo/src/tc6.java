import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class tc6 {
	@Test
	  public void f() {
		  System.out.println("testcase 1");
	  }
	  @Test
	  public void f2() {
		  System.out.println("testcase 2");
	  }
	  @BeforeMethod
	  public void beforeTest() {
		  System.out.println("before");
	  }

	  @AfterMethod
	  public void afterTest() {
		  System.out.println("after");
	  }

}
