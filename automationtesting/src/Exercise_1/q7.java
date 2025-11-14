package Exercise_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class q7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		WebElement giftcard=driver.findElement(By.xpath("//img[@src=\"https://demowebshop.tricentis.com/content/images/thumbs/0000224_141-inch-laptop_125.png\"]"));
		giftcard.click();
		WebElement cart=driver.findElement(By.id("add-to-cart-button-31"));
		cart.click();
		Actions actions=new Actions(driver);
		Thread.sleep(1000);
		WebElement shopping=driver.findElement(By.id("topcartlink"));
		WebElement gotocart=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[2]/div/div[4]/input"));
		actions.moveToElement(shopping).click(gotocart).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
