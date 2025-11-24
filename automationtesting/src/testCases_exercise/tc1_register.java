package testCases_exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjects_exercise.Fish;
import pageObjects_exercise.homepage;
import pageObjects_exercise.main_page;

public class tc1_register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://petstore.octoperf.com/");
		homepage home=new homepage(driver);
		home.clickEnterTheStore();
		main_page main=new main_page(driver);
		main.clickFish();
		Fish fish=new Fish(driver);
		fish.clickAngelFish();
		Thread.sleep(4000);
		driver.quit();
	}

}
