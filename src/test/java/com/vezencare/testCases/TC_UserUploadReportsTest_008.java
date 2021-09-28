package com.vezencare.testCases;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.Userloginpage;
import com.vezencare.pageObjects.Useruploadreportspage;

public class TC_UserUploadReportsTest_008 extends Userbaseclass {

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

		Useruploadreportspage uup=new Useruploadreportspage(driver);
		uup.uploadReports();
		logger.info("clicked on uploadreports");
		
	
			
		
		uup.searchForHospital();
		logger.info("entered hospital");
		
		uup.doctorName();
		logger.info("entered doctor name");
		
		Thread.sleep(3000);
		
		uup.selectSpecialization();
		logger.info("chose specialization");
		
		uup.uploadMedicalReports();
		logger.info("uploaded medical reports");
		
		uup.problem();
		logger.info("type problem here");
		
		Thread.sleep(3000);
		
		uup.reportDate();
		logger.info("clicked on report date");
		
		uup.uploadBtn();
		logger.info("cliked on upload button");
		
		uup.confirmationPopUp();
		logger.info("selected confiramtion popup");
		
	
		Thread.sleep(3000);
		
		
		
		
		
	}	


}
