import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class data_provider {
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://demowebshop.tricentis.com/");
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys(username);
	  driver.findElement(By.id("Password")).sendKeys(password);
	  Thread.sleep(5000);
	  driver.quit();  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"username1", "password1" },
      new Object[] { "username2", "password2" },
    };
  }
}
