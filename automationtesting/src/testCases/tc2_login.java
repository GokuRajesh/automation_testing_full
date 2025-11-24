package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import page_Objects.homePage;
import page_Objects.loginPage;

public class tc2_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		homePage home=new homePage(driver);
		home.clickLogin();
		loginPage login=new loginPage(driver);
		login.enterUsername("er1");
		login.enterPassword("werd");
		Thread.sleep(2000);
		driver.quit();
	}

}
