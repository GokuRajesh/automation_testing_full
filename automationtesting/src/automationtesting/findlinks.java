package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class findlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> links=driver.findElements(By.tagName(null))
	}

}
