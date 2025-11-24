package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc2 {
	WebDriver driver;
	@Given("the user in the login page")
	public void the_user_in_the_login_page() {
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
	}
	@When("he enters valid {string} and valid {string}")
	public void he_enters_valid_and_valid(String password, String email) {
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("he enters invalid {string} and invalid {string}")
	public void he_enters_invalid_and_invalid(String password, String email) {
		System.out.println("invalid test case");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
	}

	@Then("the system navigates to home page of the user login")
	public void the_system_navigates_to_home_page_of_the_user() {
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}


}
