package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1_steps {

	@Given("the user in the login page")
	public void the_user_in_the_login_page() {
		System.out.println("Login page");
	   
	}
	@When("he enters the valid details as {string}")
	public void he_enters_the_valid_details(String uname) {
	    System.out.println("Entering Details"+uname);
	}
	@Then("he reaches the home page")
	public void he_reaches_the_home_page() {
		System.out.println("Home page");
	    
	}




}
