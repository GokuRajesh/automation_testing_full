package stepdefinitions;

import com.sun.net.httpserver.Request;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class tc1_steps {
	static String BASE_URL="https://api.restful-api.dev/objects";
	Response response;
	RequestSpecification request;
	String output;
	
	@Given("the user in the https:\\/\\/api.restful-api.dev\\/objects")
	public void the_user_in_the_https_api_restful_api_dev_objects() {
	    RestAssured.baseURI=BASE_URL;
	}

	@When("he send the request")
	public void he_send_the_request() {
	    request=RestAssured.given();
	    response = request.get(BASE_URL);
	}

	@Then("he gets the response of {int}")
	public void he_gets_the_response_of(Integer int1) {
	    output = response.asString();
		System.out.println(output);
		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
	}

}
