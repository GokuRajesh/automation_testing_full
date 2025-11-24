package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1 {

	WebDriver driver;
	@Given("the user in the google page")
	public void the_user_in_the_google_page() {
		driver=new EdgeDriver();
	  
	}
	@When("he enters the {string} to search and submits")
	public void he_enters_the_to_search_and_submits(String string) {
	   
	}
	@Then("the user clicks to first link")
	public void the_user_clicks_to_first_link() {
	   
	}



}
