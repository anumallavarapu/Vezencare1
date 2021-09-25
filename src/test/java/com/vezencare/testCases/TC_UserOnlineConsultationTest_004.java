package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.Userdashboardpage;
import com.vezencare.pageObjects.Userloginpage;

public class TC_UserOnlineConsultationTest_004 extends Userbaseclass
{

	@Test
	public void useronlineconsultationtest() throws InterruptedException {
		
		Logger logger = LogManager.getLogger(TC_UserOnlineConsultationTest_004.class); 
			
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
		
		WebElement Element=driver.findElement(By.id("DdlFamilyMembers"));
		
		Select choosefamilymember=new Select(Element);
		
		
		
		choosefamilymember.selectByValue("c2sd8Z3SpOz4g0a9gVUF4A==");	//anusha
		
		
		Thread.sleep(2000);
		
	
		driver.navigate().refresh();
		
		

		Thread.sleep(5000);
		
		Userdashboardpage udp=new Userdashboardpage(driver); //creating object to dashboardpage
		udp.onllineApp();
		
		
		Thread.sleep(5000);

		
		udp.generalMedicineh2();
		
		String generalmedicineh3=driver.findElement(By.xpath("//h3[contains(text(),'General Medicine')]")).getText(); //h3 general medicine
	
		String actual="General Medicine";
		
		
		if(actual.contentEquals(generalmedicineh3)) {
			
			udp.state();
			logger.info("state selected");
			
			udp.dist();
			logger.info("dist selected");
			
			udp.mandal();
			logger.info("mandal selected");
			
			udp.date();
			logger.info("date has been selected");
			
			udp.submitBtn();
			logger.info("clicked on submit button");
			
			udp.requestBtn();
			logger.info("clicked on requested button");
			
			Thread.sleep(3000);
			
			udp.timeSchedule();
			logger.info("selected time schedule");
			
			
			udp.confirmRequestBtn();
			logger.info("confirm request submitted");
			Thread.sleep(3000);
			
			udp.confirmationPopup();
			logger.info("appointment has been booked wait for doctor approval");
			
			
		}
			
	
	
	}







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
