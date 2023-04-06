package Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayethri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gaye");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("NON IT batch");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayethrijayakannan1@hotmail.com");
		WebElement detail=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dd1 = new Select(detail);
        dd1.selectByValue("NY");
        driver.findElement(By.name("submitButton")).click();
        System.out.println("The page title is true"+driver.getTitle());
        if (driver.getTitle().contains("View Lead | opentaps CRM")) {
        	System.out.println("It is the right page");
        } else System.out.println("It is not the page");
        driver.findElement(By.linkText("Duplicate Lead")).click();
        WebElement Companyname = driver.findElement(By.id("createLeadForm_companyName"));
        Companyname.clear();
        Companyname.sendKeys("Treetest");
        driver.findElement(By.name("submitButton")).click();
        System.out.println("the title is:"+driver.getTitle());
        if (driver.getTitle().contains("View Lead | opentaps CRM")){
        	System.out.println("The title of the page is verified");
        	  }else System.out.println("The title of the page dose not exist");
        driver.close();
        
        
		
		
	
	}

}
