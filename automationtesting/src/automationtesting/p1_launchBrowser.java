package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class p1_launchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new EdgeDriver();
		String s;
		driver.get("http://www.google.co.in");
		s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
