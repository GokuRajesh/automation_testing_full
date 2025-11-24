package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1 {

	WebDriver driver;
	@Given("the user in the registration page")
	public void the_user_in_the_registration_page() {
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
	
	}
	@When("he enters valid {string} and valid {string} and valid {string} and valid {string}")
	public void he_enters_valid_and_valid_and_valid_and_valid(String gender, String firstname, String lastname, String email) {
		driver.findElement(By.id("gender-"+gender)).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
	}



	@Then("the system navigates to home page of the user")
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
