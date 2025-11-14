package Exercise_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class q2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://advantageonlineshopping.com/");
		WebElement speaker=driver.findElement(By.xpath("SpeakersCategory"));
		speaker.click();
		Thread.sleep(500);
		driver.quit();
	}

}
