package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class tc2 {

	@Given("the user in the login window")
	public void the_user_in_the_login_window() {
		System.out.println("login window");
	}
	@When("he enters valid {string} and valid {string}")
	public void he_enters_valid_and_valid(String string, String string2) {
		System.out.println(string+" "+string2);
	}



}
