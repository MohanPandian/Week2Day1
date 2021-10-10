package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args)
	{	
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//we cannot use id locator when id is in numbers because it will dynamcially changed 
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement findElement1 = driver.findElement(By.id("createLeadForm_companyName"));
		findElement1.sendKeys("TEST Leaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MOHAN");
    
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PANDIAN");
		
		driver.findElement(By.name("smallSubmit")).click();
		
		 
		
	}

}
