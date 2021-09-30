package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		WebElement ele=driver.findElement(By.xpath("//h4[contains(text(),'Hi anushaa polavarapu')]"));
		
		System.out.println("This is the hi message: " +ele.getText());
		
		Thread.sleep(3000);
		
		//verify image is displayed or not in webpage
		WebElement img=driver.findElement(By.tagName("img"));
		
		if(img.isDisplayed())
		{
			System.out.println("Image is displayed");
		}
		
		else
		{
			System.out.println("image is not displayed");
		}
		
		Thread.sleep(3000);
		
		WebElement logo=driver.findElement(By.tagName("img"));
		logo.click();
		
		String actual=driver.getTitle();
		String expected="Vezen Care :: Index";
		
		Assert.assertEquals(actual, expected);
		System.out.println("logo is displayed");
				
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
