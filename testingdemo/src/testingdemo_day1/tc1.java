package testingdemo_day1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class tc1 {
  @Test
  public void f() {
	  StringUtility obj=new StringUtility();
	  String s="java";
	  int expected=4,actual;
	  actual=obj.findLength(s);
	  assertEquals(expected,actual);
  }
}
