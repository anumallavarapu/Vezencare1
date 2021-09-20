package com.vezencare.pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vezencare.testCases.Userbaseclass;

public class Userloginpage {	//create class

	WebDriver ldriver;
	public static Logger _logger =LogManager.getLogger(Userloginpage.class);;
	
	public Userloginpage(WebDriver rdriver){	//create constructor 
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this); 
	}
	
	
	@FindBy(id="txtUserName")		//finding elements
	WebElement txtUsername;
	
	@FindBy(id="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="login-form-submit")
	WebElement btnlogin1;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div/nav/ul/li[18]/a")
	WebElement lnkLogout;
	
	@FindBy(id="Login")
	WebElement homeLogin;
	
	
	public void setUsername(String user)	//action methods 
	 {
		txtUsername.sendKeys(user);
	}
	
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnlogin1.click();
		
	}
	
	public void clickLogout() 
	{
		try {
		 lnkLogout.click();	
		}
		catch(Exception ex){
			_logger.error("This error message ::: "+ex);
		}
	}
	
	public void homeLoginbutton()
	{
		homeLogin.click();
		
	}
	
	public static void main(String[] args) {
		
	
	}


}
