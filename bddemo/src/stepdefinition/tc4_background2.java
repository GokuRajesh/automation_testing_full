package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;

public class tc4_background2 {


	@When("he enters the invalid details")
	public void he_enters_the_invalid_details() {
		System.out.println("hello world invalid");
	}
	
}
