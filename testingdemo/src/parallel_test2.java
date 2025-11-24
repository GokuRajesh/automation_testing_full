import org.testng.annotations.Test;

public class parallel_test2 {
	@Test
	  public void f() throws InterruptedException {
		  for(int i=0;i<=50;i++) {
			  System.out.println(i);
			  Thread.sleep(4000);
		  }
	  }
}
