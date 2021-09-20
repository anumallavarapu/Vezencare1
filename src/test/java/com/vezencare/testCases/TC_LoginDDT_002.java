package com.vezencare.testCases;

import java.io.IOException;
import java.sql.Time;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.Userloginpage;
import com.vezencare.utilities.XLUtilities;

public class TC_LoginDDT_002 extends Userbaseclass {

	
	@Test(dataProvider="LoginData")
		public void loginDDT(String uname, String pwd) throws InterruptedException
	{

		Userloginpage ulp=new Userloginpage(driver);
		
		
		ulp.setUsername(uname);
		logger1.info("username provided::"+uname);
		
	
		ulp.setPassword(pwd);
		logger1.info("password provided::"+pwd);
		
		ulp.clickSubmit();
		 Thread.sleep(2000);
		
		 if(isAlertPresent()==true) 
			{
				
			 
			//	driver.switchTo().alert().getText();
				
				//driver.switchTo().defaultContent();
				Assert.assertTrue(false);
				
				
				logger1.warn("Login failed");
				
				driver.navigate().refresh();
				//driver.navigate().to(driver.getCurrentUrl());
			
				
			//	driver.findElement(By.id("txtUsername")).clear();
				

				
			}
			else 
			{
				
				Assert.assertTrue(true);
				logger1.info("login passed");
				Thread.sleep(1000);
				ulp.clickLogout();
				
				driver.get(baseURL);
				//ulp.homeLoginbutton(); //go to home login button
				
				//driver.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div/div[1]/div/div/form/div/a[1]"));
			}
			
			}
			
			
			public boolean isAlertPresent() 
			{
				try 
				{
					
					driver.switchTo().alert();
					return true;
				}
				catch(NoAlertPresentException e)
				{
					return false;
				}
			}
			
	
	@DataProvider(name="LoginData") //data provider is provide data to testcase
	String [][] getdata() throws IOException{
		
		
		String path= System.getProperty("user.dir") + "/src/test/java/com/vezencare/testData/Member login data.xlsx" ;
		
		int rownum=XLUtilities.getRowCount(path, "Sheet1");	//count no.r of rows from xlfile
		int colcount=XLUtilities.getCellCount(path, "Sheet1", 1);	//count no.r columns from xlfile
				
		String logindata[][]=new String[rownum][colcount];	//adding row and col count to the 2 dimensional array
	
	
		for(int i=1;i<=rownum;i++) 		//getting data from row
		{
			for(int j=0;j<colcount;j++) //getting data from column
			{
				
				logindata[i-1][j]=XLUtilities.getcelldata(path, "Sheet1", i, j); //keep data here. this will ready by logindata[][]
			}	
			
		}
		
		
	
		return logindata;
	
		}

	}


