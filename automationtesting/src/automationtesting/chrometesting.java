package automationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class chrometesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		String s;
		driver.get("http://www.google.co.in");
		s=driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
