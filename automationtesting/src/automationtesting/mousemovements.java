package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.errorprone.annotations.ThreadSafe;

public class mousemovements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		WebElement computer=driver.findElement(By.linkText("COMPUTERS"));
		Actions actions=new Actions(driver);
		actions.moveToElement(computer).build().perform();
		WebElement notebooks=driver.findElement(By.linkText("Notebooks"));
		notebooks.click();
		Select selector=new Select(driver.findElement(By.id("products-orderby")));
		int count=selector.getOptions().size();
		System.out.println("Size :"+count);
		for(int i=0;i<count;i++) {
			selector.selectByIndex(i);
			selector=new Select(driver.findElement(By.id("products-orderby")));
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		notebooks.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
