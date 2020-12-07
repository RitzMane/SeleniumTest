package com.orangehrmlive;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	WebDriver driver;
	
	//precondition( don't show passed as it comes under configuration(TEST))
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Opening the browser");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rutuj\\ASDM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Logging IN");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.name("Submit")).click();
	}
	
	@Test 
	public void adminTest()
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Admin")).click();
	}
	@Test 
	public void leaveTest()
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Leave")).click();
	}
	@Test 
	public void timeTest()
	{
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Time")).click();
	}
	
	@AfterMethod 
	public void logout()
	{
		//for synchronisation (as it takes time to check[Asked web-driver to wait 2 sec])
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
	}
	//postcondition( don't show passed as it comes under configuration(TEST))
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	

}
