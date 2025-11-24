package day4;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headless_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.co.in");
		String s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
