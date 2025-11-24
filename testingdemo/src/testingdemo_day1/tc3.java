package testingdemo_day1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class tc3 {
  @Test
  public void f() {
	  StringUtility obj=new StringUtility();
	  int expected=6,actual;
	  actual=obj.findLength("jmeter");
	  assertEquals(expected, actual);
  }
}
