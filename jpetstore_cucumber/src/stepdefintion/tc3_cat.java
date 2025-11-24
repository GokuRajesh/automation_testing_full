package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc3_cat {

	WebDriver driver;
	
	@Given("the user in the HOME page for cat")
	public void the_user_in_the_home_page_for_cat() {
		 driver=new EdgeDriver();
		    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	    
	}
	@When("he selects enter the store he selects the cat")
	public void he_selects_enter_the_store_he_selects_the_cat() {
		driver.findElement(By.xpath("//area[@alt='Cats']")).click();
	    
	}
	@Then("he reaches the cat product window")
	public void he_reaches_the_cat_product_window() throws InterruptedException {
		System.out.println("cat product window reached");
		Thread.sleep(4000);
	    driver.quit();
	}



}
