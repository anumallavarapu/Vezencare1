package com.vezencare.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilePage {


	WebDriver ldriver;
	public static Logger _logger =LogManager.getLogger(Userloginpage.class);;
	
	public UserProfilePage(WebDriver rdriver){	//create constructor 
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this); 


	}

	
	@FindBy(xpath="/html/body/div[1]/header/div/div/nav/ul/li[2]/a") //personal profile page element
	WebElement PersonalProfile;
	
	@FindBy(xpath="/html/body/div[1]/section/div[2]/div/form/div/div[5]/a") //edit element
	WebElement Edit;
	
	@FindBy(id="txtFirstName")	//firstname element
	WebElement FirstName;
	
	@FindBy(id="txtLastName")	//lastname element
	WebElement LastName;
	
	@FindBy(id="txtDob")	//dateofbirth element
	WebElement DateOfBirth;
	
	@FindBy(xpath="//button[contains(text(),'Update')")
	WebElement Updatebtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[4]/div[2]/button[1]")	
	WebElement Confirmationpopup;

	public void personalProfile()
	{
		
		PersonalProfile.click();
		
	}
	
		public void edit() 
	{
		
		Edit.click();
	}
	
	public void firstName()
	{
		FirstName.clear();
		FirstName.sendKeys("yokshitha");
	}
	
	public void lasttName()
	{
		LastName.clear();
		LastName.sendKeys("polavarapu");
	}
	
	public void dateOfBirth()
	{
		//DateOfBirth.sendKeys(keysToSend);
	}
		
	public void updateBtn()
	{
		Updatebtn.click();
	}
	
	public void confirmationPopup()
	{
		Confirmationpopup.click();
	}
		
		
		
		
		
		
		
	
	
	
}
