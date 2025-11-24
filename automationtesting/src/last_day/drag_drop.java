package last_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new EdgeDriver();
        driver.get(
            "https://jqueryui.com/resources/demos/droppable/default.html");

        // Navigate to URL
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
            Actions action = new Actions(driver);
            WebElement drag
                = driver.findElement(By.id("draggable"));
            WebElement drop
                = driver.findElement(By.id("droppable"));

            action.dragAndDrop(drag, drop)
                .build()
                .perform();

            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       
        driver.close();
		// TODO Auto-generated method stub
	}

}
