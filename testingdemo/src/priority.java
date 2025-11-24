import org.testng.annotations.Test;

public class priority {
  @Test(priority=3)
  public void f() {
	  System.out.println("apple");
  }
  @Test(priority=2)
  public void f2() {
	  System.out.println("apple2");
  }
  @Test(priority=1)
  public void f1() {
	  System.out.println("apple1");
  }
}
