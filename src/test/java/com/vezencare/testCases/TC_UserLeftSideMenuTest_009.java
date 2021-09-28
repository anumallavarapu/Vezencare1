package com.vezencare.testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.vezencare.pageObjects.Userloginpage;

public class TC_UserLeftSideMenuTest_009 extends Userbaseclass
{
@Test
	public void userleftsidemenu() throws InterruptedException 
	{
		
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
	
	WebElement ele1=driver.findElement(By.xpath("//div[contains(text(),'Personal Profile')]"));
	ele1.click();
	
	Thread.sleep(3000);
	
	String title1=driver.getTitle();
	String expected1="Vezen Care :: PersonalProfile";
	
	//Assert.assertEquals(title1, expected);
	
	
	if(title1.matches(expected1))
	{
		System.out.println("This title is " +title1);
	}

	driver.navigate().back();
	
	
	WebElement ele2=driver.findElement(By.xpath("//div[contains(text(),'Health Profile')]")); //health profile
	ele2.click();
	
	Thread.sleep(3000);
	
	String title2=driver.getTitle();
	String expected2="Vezen Care :: HealthProfile";
	
	Assert.assertEquals(title2, expected2);
	System.out.println("This title is " +title2);
	
	
	driver.navigate().back();
	
	Thread.sleep(3000);
	
	
	WebElement ele3=driver.findElement(By.xpath("//div[contains(text(),'Family Health History')]")); //family hlth history
	ele3.click();
	Thread.sleep(3000);
	
	String title3=driver.getTitle();
	String expected3="Vezen Care :: FamilyHealthHistory";
	
	Assert.assertEquals(title3, expected3);
	System.out.println("This title is " +title3);
	driver.navigate().back();
	
	Thread.sleep(3000);
	WebElement ele4=driver.findElement(By.xpath("//div[contains(text(),'Medical Records')]"));
	ele4.click();
	Thread.sleep(3000);
	
	String title4=driver.getTitle();
	String expected4="Vezen Care :: MedicalRecords";
			
	Assert.assertEquals(title4, expected4);
	System.out.println("This title is " +title4);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele5=driver.findElement(By.xpath("//div[contains(text(),'Vaccination')]"));
	ele5.click();
	Thread.sleep(3000);
	
	String title5=driver.getTitle();
	String expected5="Vezen Care :: Vaccination";
	
	Assert.assertEquals(title5, expected5);
	System.out.println("This title is " +title5);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele6=driver.findElement(By.xpath("//div[contains(text(),'General Health Checkup Report')]"));
	ele6.click();
	Thread.sleep(3000);
	
	String title6=driver.getTitle();
	String expected6="Vezen Care :: Generalhealth Checkup";
	
	Assert.assertEquals(title6, expected6);
	System.out.println("This title is " +title6);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele7=driver.findElement(By.xpath("//div[contains(text(),'BMI report')]"));
	ele7.click();
	Thread.sleep(3000);
	
	String title7=driver.getTitle();
	String expected7="Vezen Care :: BMIReport";
	
	Assert.assertEquals(title7, expected7);
	System.out.println("This title is " +title7);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele8=driver.findElement(By.xpath("//div[contains(text(),'Attach Family Member')]"));
	ele8.click();
	Thread.sleep(3000);
	
	String title8=driver.getTitle();
	String expected8="Vezen Care :: AttachFamilyMember";
	
	Assert.assertEquals(title8, expected8);
	System.out.println("This title is " +title8);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	WebElement ele9=driver.findElement(By.xpath("//div[contains(text(),'Physical Appointment')]"));
	ele9.click();
	Thread.sleep(3000);
	
	String title9=driver.getTitle();
	String expected9="Vezen Care :: Specializations";
	
	Assert.assertEquals(title9, expected9);
	System.out.println("This title is " +title9);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele10=driver.findElement(By.xpath("//div[contains(text(),'Video Consultation')]"));
	ele10.click();
	Thread.sleep(3000);
	
	String title10=driver.getTitle();
	String expected10="Vezen Care :: Specializations";
	
	Assert.assertEquals(title10, expected10);
	System.out.println("This title is " +title10);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele11=driver.findElement(By.xpath("//div[contains(text(),'Medication Delivery')]"));
	ele11.click();
	Thread.sleep(3000);
	
	String title11=driver.getTitle();
	String expected11="Vezen Care :: MedicationDelivery";
	
	Assert.assertEquals(title11, expected11);
	System.out.println("This title is " +title11);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele12=driver.findElement(By.xpath("//div[contains(text(),'Caretaker Service')]"));
	ele12.click();
	Thread.sleep(3000);
	
	String title12=driver.getTitle();
	String expected12="Vezen Care :: CareTakerServices";
	
	Assert.assertEquals(title12, expected12);
	System.out.println("This title is " +title12);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele13=driver.findElement(By.xpath("//div[contains(text(),'Booked Consultations')]"));
	ele13.click();
	Thread.sleep(3000);
	
	String title13=driver.getTitle();
	String expected13="Vezen Care :: User_Doctor_Consultation";
	
	Assert.assertEquals(title13, expected13);
	System.out.println("This title is " +title13);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele14=driver.findElement(By.xpath("//div[contains(text(),'Upload Reports')]"));
	ele14.click();
	Thread.sleep(3000);
	
	String title14=driver.getTitle();
	String expected14="Vezen Care :: UserDocuments";
	
	Assert.assertEquals(title14, expected14);
	System.out.println("This title is " +title14);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	WebElement ele15=driver.findElement(By.xpath("//div[contains(text(),'My Health Card')]"));
	ele15.click();
	Thread.sleep(3000);
	
	String title15=driver.getTitle();
	String expected15="Vezen Care :: View Health Card";
	
	Assert.assertEquals(title15, expected15);
	System.out.println("This title is " +title15);
	
	driver.navigate().back();
	Thread.sleep(3000);
	WebElement ele16=driver.findElement(By.xpath("//div[contains(text(),'Change Password')]"));
	ele16.click();
	Thread.sleep(3000);
	
	String title16=driver.getTitle();
	String expected16="Vezen Care :: ChangePassword";
	
	Assert.assertEquals(title16, expected16);
	System.out.println("This title is " +title16);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	
	
	
	}
	
	
	
	
}
