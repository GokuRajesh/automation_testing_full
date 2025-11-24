package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pagefactory.homePage;
import pagefactory.registerPage;


public class tc1_registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		homePage home=new homePage(driver);
		home.clickRegister();
		registerPage register=new registerPage(driver);
		register.enterFirstname("sample firstname");
		register.enterLastname("sameple lastname");
		Thread.sleep(2000);
		driver.quit();
	}

}
