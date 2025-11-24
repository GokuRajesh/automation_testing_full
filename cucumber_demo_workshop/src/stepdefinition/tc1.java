package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class tc1 {
	WebDriver driver;
	@Given("the user in the login page")
	public void the_user_in_the_login_page() {
		driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		System.out.println("Login page");
	   
	}
	@When("he enters the valid details")
	public void he_enters_the_valid_details() {
	    System.out.println("Entering Details");
	}
	@Then("he reaches the home page")
	public void he_reaches_the_home_page() {
		System.out.println("Home page");
	    
	}
}
