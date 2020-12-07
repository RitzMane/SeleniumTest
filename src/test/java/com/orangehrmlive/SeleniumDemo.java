package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	WebDriver driver;
	
	//Same program using functions
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\ASDM\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	void enterURL()
	{
		//Passing that url for testing
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	void login()
	{
		//Locate the username element and pass test data into it
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				
				driver.findElement(By.name("Submit")).click();
	}
	
	public static void main(String[] args) {
		
		SeleniumDemo sd=new SeleniumDemo();
		sd.openBrowser();
		sd.enterURL();
		sd.login();
		
		
		/*//ECLIPSE USING CHROME NEED THIRD PARTY
		//Opens the browser window
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\ASDM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Getting that url for testing
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		

		//Locate the username element and pass test data into it
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();*/

		
	}

}
