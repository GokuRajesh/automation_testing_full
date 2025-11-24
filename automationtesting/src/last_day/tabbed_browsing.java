package last_day;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class tabbed_browsing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String first = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("http://www.google.co.in");
		String second = driver.getWindowHandle();
		
		driver.switchTo().window(first);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(second);
		
		Thread.sleep(2000);
		driver.quit();
	}

}
