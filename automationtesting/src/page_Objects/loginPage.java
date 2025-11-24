package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {


		// TODO Auto-generated method stub
		WebDriver driver;
		WebElement username,password;
		public loginPage(WebDriver driver){
			this.driver=driver;
		}
		public void enterUsername(String s) {
			username=driver.findElement(By.id("Email"));
			username.sendKeys(s);
		}
		public void enterPassword(String s) {
			password=driver.findElement(By.id("Password"));
			password.sendKeys(s);
		}
	}

