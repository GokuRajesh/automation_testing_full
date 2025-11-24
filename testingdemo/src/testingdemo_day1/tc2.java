package testingdemo_day1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class tc2 {
  @Test
  public void f() {
	  StringUtility obj=new StringUtility();
	  int expected=8,actual;
	  actual=obj.findLength("selenium");
	  assertEquals(expected, actual);
  }
}
