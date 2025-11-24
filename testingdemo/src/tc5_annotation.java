import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class tc5_annotation {
  @Test
  public void f() {
	  System.out.println("testcase 1");
  }
  @Test
  public void f2() {
	  System.out.println("testcase 2");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after");
  }

}
