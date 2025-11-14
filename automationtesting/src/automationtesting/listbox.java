package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.*;

public class listbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://blazedemo.com");
		Select flyfrom=new Select(driver.findElement(By.name("fromPort")));
		int count=flyfrom.getOptions().size();
		System.out.println(count);
		flyfrom.selectByVisibleText("Mexico City");
		Thread.sleep(5000);
		int i=0;
		for(i=0;i<count;i++) {
			flyfrom.selectByIndex(i);
			Thread.sleep(2000);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
