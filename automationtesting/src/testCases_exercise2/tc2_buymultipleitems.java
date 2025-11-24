package testCases_exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObject_exercise2.cartsPage;
import pageObject_exercise2.loginPage;
import pageObject_exercise2.productsPage;

public class tc2_buymultipleitems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		loginPage login=new loginPage(driver);
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginButton();
		productsPage product=new productsPage(driver);
		product.verifyItemExists("Sauce Labs Backpack");
		product.addtoCart("Sauce Labs Backpack");
		product.addtoCart("Sauce Labs Bolt T-Shirt");
		cartsPage cart=new cartsPage(driver);
		cart.clickCheckout();
		cart.enterFirstName("raju");
		cart.enterLastNamse("t");
		cart.enterZip("123");
		Thread.sleep(4000);
		driver.quit();
	}

}
