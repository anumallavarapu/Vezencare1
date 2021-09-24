package com.vezencare.testCases;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
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
		
	/*	choosefamilymember.selectByVisibleText("anu polavarapu - 92455mberm");	//anu polavarapu 
		
		Thread.sleep(2000);
		
	try {
			
			choosefamilymember.selectByValue("q943IeWBOdGRcFQHTga71Q==");	//raju   
	
		}
		
		catch(Exception ex){
			
			WebElement Element1=driver.findElement(By.id("DdlFamilyMembers"));
			Select familymember1=new Select(Element1);
			
			familymember1.selectByValue("q943IeWBOdGRcFQHTga71Q==");
			
		
		
		} 
	*/	driver.navigate().refresh();
		
		

		Thread.sleep(5000);
		
		Userdashboardpage udp=new Userdashboardpage(driver); //creating object to dashboardpage
		udp.Physicalapp();
		
		
		Thread.sleep(5000);

		WebElement generalmedicineh2 =driver.findElement(By.xpath("//h2[contains(text(),'General Medicine')]"));	//h2 general medicine
		
		Actions action = new Actions(driver); //mouse move actions
		action.moveToElement(generalmedicineh2).perform();
		
		String generalmedicineh3=driver.findElement(By.xpath("//h3[contains(text(),'General Medicine')]")).getText(); //h3 general medicine
		String actual="General Medicine";
		
		
		if(actual.contentEquals(generalmedicineh3)) {
			
			
			
			WebElement state=driver.findElement(By.id("DdlState"));	//state webelement
			Select choosestate=new Select(state);
			
			WebElement district=driver.findElement(By.id("DdlDistrict"));	//dist webelement
			Select choosedistrict=new Select(district);
			
			WebElement mandal=driver.findElement(By.id("DdlMandal"));	//mandal webelement
			Select choosemandal=new Select(mandal);
			
			choosestate.selectByValue("1");
			logger.info("state selected");
			
			choosedistrict.selectByValue("11");
			logger.info("dist selected");
			
			choosemandal.selectByVisibleText("Golugonda");
			logger.info("mandal selected");
			
			Thread.sleep(3000);
			
			WebElement date=driver.findElement(By.id("txtDate"));	//open the date picker"
			date.click();
			Thread.sleep(3000);
			
			
			date.sendKeys("26-09"); //open the date picker"
			logger.info("date has been selected");
			
			Thread.sleep(3000);
			
			
			
			
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
			logger.info("clicked on submit button");
			
			
			Thread.sleep(3000);
		
			driver.findElement(By.xpath("//button[contains(text(),'Request')]")).click();
			logger.info("clicked on requested button");
			
			Thread.sleep(3000);
			
			
			driver.findElement(By.cssSelector("input[id='morning']")).click();
			
				Thread.sleep(3000);
				driver.findElement(By.id("A78")).click();
				logger.info("confirm request submitted");
				
				Thread.sleep(3000);
				
				//driver.switchTo().alert().accept();
			
		driver.findElement(By.xpath("//button[contains(text(),'Yes, I am sure!')]")).click();
		logger.info("appointment has been booked wait for doctor approval");
			
			
			
			
			
			
			
			//Thread.sleep(3000);
		//	driver.findElement(By.id("A78")).click();
		//	logger.info("submit timing");
		
		}
		
		
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private Select Select(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}


}
		
		
	





