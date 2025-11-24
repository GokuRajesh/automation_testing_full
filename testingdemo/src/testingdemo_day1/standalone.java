package testingdemo_day1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class standalone {

	static WebDriver driver;
	static String nodeURL;
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		nodeURL="http://172.19.35.14:4444/ui/";
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver =new RemoteWebDriver(new URL(nodeURL),capabilities);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
