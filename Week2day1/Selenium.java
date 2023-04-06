package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        
      WebElement username= driver.findElement(By.id("username"));
      username.sendKeys("demosalesManager");
      
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      
      driver.findElement(By.className("decorativeSubmit")).click();
      
      driver.findElement(By.linkText("CRM/SFA")).click();
      
      driver.findElement(By.linkText("Leads")).click();
      
      
     
       
	}

}
