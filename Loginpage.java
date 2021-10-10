package Seleniumsample;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {

		// 1.set up the driver
		// it will download the driver
		// and set up the path

		WebDriverManager.chromedriver().setup();

		// WebDriverManager.edgedriver().setup();

		// step2: to open the chrome browser
		// we have to create an object for accessing the chrome driver

		// EdgeDriver driver=new EdgeDriver();

		ChromeDriver driver = new ChromeDriver();

		// step 3 : To load application URL
		// protocol is mandatory for selenium
		driver.get("http://leaftaps.com/opentaps/control/main");
		// or
		// driver.navigate().to("http://leaftaps.com/opentaps/control/main");

		Thread.sleep(2000);

		// Step 4: to close the browser
		driver.close();

//Precondition: Locate the element for interact with webpage
//It will open inspect option in elements tab

//DOM-Document Object Module(to get the information about web element) 
//html tag we called its as DOM(ctrl+shift+i or F12) - root tag
//TAG name should be mandatory for web element
//attributes will be in brown color for giving extra information
//attribute value will be in blue color 
//Web element text will be in black color

		// Step5: enter the UN(DEMOSALESMANAGER) and PWD (crmsfa)

	}

}
