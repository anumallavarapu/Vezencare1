package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.UserProfilePage;
import com.vezencare.pageObjects.Userloginpage;

public class TC_UserProfilePageTest_003 extends Userbaseclass {

	@Test
	public void UserProfilePage() throws InterruptedException {
		
		
		Logger logger = LogManager.getLogger(TC_UserProfilePageTest_003.class); 
		
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
		
		
		UserProfilePage upp=new UserProfilePage(driver); //create tobject to profilepageobject
		upp.personalProfile();
		logger.info("clicked on personal profile page");
		
		
		upp.edit();
		logger.info("clicked on edit button");
		
		Thread.sleep(3000);
		
		
		upp.firstName();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/form/div/div[5]/button")).click();
		
		Thread.sleep(3000);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



















}
