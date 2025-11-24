package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		WebElement fname,lname;
		
		public registerPage(WebDriver driver){
			this.driver=driver;
		}
		
		public void enterFirstname(String s) {
			fname=driver.findElement(By.id("FirstName"));
			fname.sendKeys(s);
		}
		public void enterLastname(String s) {
			lname=driver.findElement(By.id("LastName"));
			lname.sendKeys(s);
		}
	}


