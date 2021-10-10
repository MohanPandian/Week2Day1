package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//To maximise the windows
		//browser size will be maximsied
		//it need to be used on starting
		driver.manage().window().maximize();
		
		//To read text from web element
		//web element should have a text and it should be in black color text
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
				
		String text1 = driver.findElement(By.id("username")).getText();
		System.out.println(text1);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Thread.sleep(2000);
		//driver.close();

	//	1. step1 locate the element(used for find single element(web element))
		WebElement findElement = driver.findElement(By.id("username"));
    
		//short cut to save variable
		//1. step1 locate the element(used for find Multiple element)
		//driver.findElements(locator);
		
		//2. type a value to the field
		findElement.sendKeys("Demosalesmanager");
		
		//driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				
		//using tag name locator
		//driver.findElement(By.tagName("input")).sendKeys("Demosalesmanager");
		
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys("crmsfa");
		
		//3. method to send keys
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		//To minimise the windows
				//browser size will be minimise
				//it need to be used on starting
				driver.manage().window().minimize();
		
	}

}
