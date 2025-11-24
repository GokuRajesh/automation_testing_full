package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1 {

	@Given("I am new")
	public void i_am_new() {
	    System.out.println("new ");
	}

	@When("I test")
	public void i_test() {
	    System.out.println("test");
	}

	@Then("it is working")
	public void it_is_working() {
	    System.out.println("working");
	}


}
