package Seleniumsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadCreation {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");

		// To maximise the windows
		driver.manage().window().maximize();

		// 1. step1 locate the element(used for find single element(web element))
		// 2. Enter UserName and Password
		// 3. Click on Login Button
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// 4.Click on CRM/SFA Link
		// 5.Click on Leads Button
		// 6.Click on create Lead Button

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		// 7. Enter all the text fields in CreateLead page

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Plintron");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MOHAN");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PANDIAN");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MOH");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("PAN");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("07/09/97");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Software Engineer");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3000000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("4574");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("MXP");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Plintron Lead Creation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("New Lead should be craeted");

		// 8. Enter all the text fields in contact information

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8248550584");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mohan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mohan.p9797@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.gmail.com/");

		// 9. Enter all the text fields in primary address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Mohan");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Moh");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No: 3/566, Jai Shanakar Nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Palavakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600041");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600041");

		// 10. Get the Firstname and print it

		String Name = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("First Name: " + Name);

		// 11. Click on create Lead Button
		Thread.sleep(5000);
		driver.findElement(By.name("submitButton")).click();

		// 12. Get and Verify the Title of the resulting Page(View Lead)
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Create Lead | opentaps CRM")) {
			System.out.println("Title is available as expected");
		} else {
			System.out.println("Title is not displayed as expected");
		}

		Thread.sleep(5000);
		driver.close();

	}

}
