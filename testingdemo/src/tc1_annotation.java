import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class tc1_annotation {
  @Test
  public void f() {
	  System.out.println("Test case is running");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Browser started");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Browser got closed");
  }

}
