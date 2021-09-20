package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.vezencare.pageObjects.Userdashboardpage;
import com.vezencare.pageObjects.Userloginpage;

public class TC_UserdashboardTest_002 extends Userbaseclass{
	

	
	@Test
	public void userDashboardTest() throws InterruptedException {
		
		Logger logger = LogManager.getLogger(TC_UserdashboardTest_002.class); 
			
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
		
		choosefamilymember.selectByVisibleText("anu polavarapu - 92455mberm");	//fgdg dfdsf - 92455mberm 
		
		Thread.sleep(2000);
		
	try {
			
			choosefamilymember.selectByValue("q943IeWBOdGRcFQHTga71Q==");	//raju   
	
		}
		
		catch(Exception ex){
			
			WebElement Element1=driver.findElement(By.id("DdlFamilyMembers"));
			Select familymember1=new Select(Element1);
			
			familymember1.selectByValue("q943IeWBOdGRcFQHTga71Q==");
			
		
		
		}
		driver.navigate().refresh();

		Thread.sleep(5000);
		
		Userdashboardpage udp=new Userdashboardpage(driver);
		udp.Physicalapp();
		
		Thread.sleep(5000);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


}
		
		
	





