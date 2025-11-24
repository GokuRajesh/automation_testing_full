package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {

	WebDriver driver;
	
	@FindBy(id="FirstName")
	WebElement fname;
	
	@FindBy(id="LastName")
	WebElement lname;
	
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
