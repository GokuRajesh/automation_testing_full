package day4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class usingProperties{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream("C:\\Selenium demo\\automationtesting\\src\\object.properties");
		obj.load(objfile);
		String register=obj.getProperty("register");
		String fname=obj.getProperty("fname");
		String lname=obj.getProperty("lname");
		String login=obj.getProperty("login");
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText(register)).click();
		driver.findElement(By.id(fname)).sendKeys("abc");
		driver.findElement(By.id(lname)).sendKeys("jiko");
		Thread.sleep(2000);
		driver.quit();
	}

}
