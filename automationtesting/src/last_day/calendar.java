package last_day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		 driver = new EdgeDriver();
		     driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		     driver.findElement(By.id("datepicker")).click();
		         Thread.sleep(2000);
		         String cyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		         String cmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		         Thread.sleep(2000);
		         while(!(cyear.equals("2026") && cmonth.equals("April")))
		         {
		              driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		             cyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		             cmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		             Thread.sleep(2000);
		         }
		         Thread.sleep(5000);
		         driver.quit();

	}

}
