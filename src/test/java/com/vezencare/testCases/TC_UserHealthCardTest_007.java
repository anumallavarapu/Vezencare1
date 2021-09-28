package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.Userhealthcardpage;
import com.vezencare.pageObjects.Userloginpage;

public class TC_UserHealthCardTest_007 extends Userbaseclass{

	@Test
	public void userhealthcard() throws InterruptedException {
		
		Logger logger = LogManager.getLogger(TC_UserHealthCardTest_007.class); 
			
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
		
		Userhealthcardpage uhc=new Userhealthcardpage(driver);
		uhc.myHealthCard();
		logger.info("redirect to healthcard page");
		
		uhc.downloadHealthCard();
		logger.info("healthcard downloaded");

		Thread.sleep(3000);
















	}
}
