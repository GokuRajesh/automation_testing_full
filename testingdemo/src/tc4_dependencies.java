import org.testng.annotations.Test;

public class tc4_dependencies {
  @Test
  public void f() {
	  System.out.println("ello");
  }
  @Test(dependsOnMethods= {"a"})
  public void z() {
	  System.out.println("last case");
  }
  @Test(dependsOnMethods= {"f"})
  public void a() {
	  System.out.println("2nd case");
  }
}
