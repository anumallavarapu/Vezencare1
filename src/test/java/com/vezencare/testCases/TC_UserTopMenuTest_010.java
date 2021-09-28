package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.Userloginpage;

public class TC_UserTopMenuTest_010 extends Userbaseclass {
	
	@Test
	
	public void Usertopmenutest() throws InterruptedException 
	{

		Logger logger = LogManager.getLogger(TC_UserTopMenuTest_010.class); 
		
		logger.fatal("Launch browser"); 
		
		driver.get(baseURL);
		
		driver.manage().window().maximize();
		
		logger.info("Browser successfully opened ");			
		Userloginpage ulp=new Userloginpage(driver);
		
		ulp.setUsername(memberusername);
		logger.info("username entered");	//generatelogging reports
			
		
					
		ulp.setPassword(memberpassword);		
		logger.info("password entered");
		
	
		ulp.clickSubmit();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Personal Profile')]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		String firstname=driver.findElement(By.xpath("//input[@id='txtFirstName']")).getText();
		
		driver.findElement(By.xpath("//button[contains(text(),'Update')]")).click();
		
		
		driver.navigate().back();
		String expected="Hi anushaa polavarapu" ;
		
		Assert.assertEquals(firstname, expected);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
