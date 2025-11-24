import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class calcTest {

  @Test
  public void addNumbersTest() {
	int a=2,b=2,expoutput=4,actoutput;
	calc obj=new calc();
	actoutput=obj.addNumbers(a, b) ;
	 assertEquals(actoutput, expoutput);
			}
}
