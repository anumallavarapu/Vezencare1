package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.UserMedicationdelivery;
import com.vezencare.pageObjects.Userloginpage;

public class TC_UserMedicationDeliveryTest_005 extends Userbaseclass {
	
	@Test
	public void usermedicaldeliveryTest() throws InterruptedException {
		
		Logger logger = LogManager.getLogger(TC_UserMedicationDeliveryTest_005.class); 
		
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
		
		UserMedicationdelivery umd=new UserMedicationdelivery(driver);
		umd.medicationDelivery();
		logger.info("clicked on medication delivery");
		
		umd.medDelPriority();
		logger.info("priority chose");
		
		umd.drName();
		logger.info("Entered doctor name");
		
		umd.hptName();
		logger.info("Entered hospital name");
		
		umd.pharName();
		logger.info("Entered pharmacy name");
		
		umd.contactPhNo();
		logger.info("Entered contact ph no");
		
		umd.contactPerName();
		logger.info("Entere contact person name here");
		Thread.sleep(3000);
		
		umd.address();
		logger.info("add address");
		
		Thread.sleep(4000);
		umd.chooseFile();
		logger.info("successfully upload the file");		
		Thread.sleep(4000);
		
		umd.medDelSubBtn();
		logger.info("successfully confirmed medication delivery");
		
		
		Thread.sleep(3000);
		
		umd.confirmationPopup();
		
		Thread.sleep(3000);

		
	}
	


}
