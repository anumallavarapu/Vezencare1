package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.UserCaretakerservice;
import com.vezencare.pageObjects.Userloginpage;

public class TC_UserCareTakerServiceTest_006 extends Userbaseclass {
	@Test
	public void usercaretakerservice() throws InterruptedException {
		
		Logger logger = LogManager.getLogger(TC_UserCareTakerServiceTest_006.class); 
		
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

		UserCaretakerservice ucs=new UserCaretakerservice(driver);
		ucs.careTakerService();
		logger.info("clicked on caretakerservice");
		
		ucs.serviceFor();
		logger.info("choose service for hospital/home assistance");
		
		ucs.serviceDate();
		logger.info("choose service date");
		
		ucs.timeSlot();
		logger.info("choose timeslot");
		
		ucs.contactPhNo();
		logger.info("entered contact ph no");
		Thread.sleep(2000);
		
		ucs.contactPerName();
		logger.info("entered contact person name");
		Thread.sleep(2000);
		ucs.selectAddress();
		logger.info("select address by using database");
		Thread.sleep(2000);
		ucs.enterAddress();
		logger.info("entered address manually");
		Thread.sleep(2000);
		
		ucs.careTakerSubBtn();
		logger.info("clicked on submit button");
		
		ucs.confirmationPopup();
		logger.info("booking confirmed");
	
		Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}