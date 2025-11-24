package stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tc1_fish {
	public static WebDriver driver;
	@Given("the user in the HOME page")
	public void the_user_in_the_home_page() {
	    driver=new EdgeDriver();
	    driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}
	@When("he selects enter the store he selects the fish")
	public void he_selects_enter_the_store_he_selects_the_fish() {
		driver.findElement(By.xpath("//area[@alt='Fish']")).click();
	}
	@Then("he reaches the fish product windows")
	public void he_reaches_the_fish_product_windows() {
	    System.out.println("fish product window reached");
	    try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.quit();
	}



}
