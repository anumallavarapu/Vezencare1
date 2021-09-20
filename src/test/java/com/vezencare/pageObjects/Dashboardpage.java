package com.vezencare.pageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Dashboardpage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver;
		
	
		System.setProperty("webdriver.gecko.driver", "G:/Eclipse-My Workspace/Vezencare/Drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://qa.vezencare.com/Home/UserLogin");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUserName")).sendKeys("9346078959");
		driver.findElement(By.id("txtPassword")).sendKeys("1234");
		driver.findElement(By.id("login-form-submit")).click();
		
		Thread.sleep(2000);
		
				
		WebElement Element=driver.findElement(By.id("DdlFamilyMembers"));
		
		
		Select familymember=new Select(Element);
		
	
		
	//	WebDriverWait wait = new WebDriverWait(driver, 10);
	//	Element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DdlFamilyMembers")));
		
		
	
		
		familymember.selectByValue("c2sd8Z3SpOz4g0a9gVUF4A==");	//anusha
		
		
		Thread.sleep(2000);
		
		familymember.selectByVisibleText("anu polavarapu - 92455mberm");	//fgdg dfdsf - 92455mberm 
		
		Thread.sleep(2000);
		try {
		familymember.selectByValue("q943IeWBOdGRcFQHTga71Q==");//raju   
	
		}
		catch(Exception ex){
			
			WebElement Element1=driver.findElement(By.id("DdlFamilyMembers"));
			Select familymember1=new Select(Element1);
			
			familymember1.selectByValue("q943IeWBOdGRcFQHTga71Q==");
			
		driver.close();
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	}
}
