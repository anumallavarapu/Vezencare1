package com.vezencare.testCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.vezencare.pageObjects.Userloginpage;

public class TC_UserLoginTest_001 extends Userbaseclass 
{

		
		@Test
		public void userLoginTest() {
			
			Logger logger = LogManager.getLogger(TC_UserLoginTest_001.class); 
			
		
			logger.fatal("Launch browser"); 
			
			driver.get(baseURL);
			
			logger.info("Browser successfully opened ");			
			Userloginpage ulp=new Userloginpage(driver);
			
			ulp.setUsername(memberusername);
			logger.info("username entered");	//generatelogging reports
				
			
						
			ulp.setPassword(memberpassword);		
			logger.info("password entered");
			
		
			ulp.clickSubmit();
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
	        try{
	            wait.until(ExpectedConditions.titleIs("Vezen Care :: DashBoard"));
	           
	            if(driver.getTitle().equals("Vezen Care :: DashBoard")) {
					
					Assert.assertTrue(true);
				}

				else {
					
					Assert.assertTrue(false);
				}	
	        }
	        finally {
	        	
	        }
			
		
		}

			
		
	}
		
