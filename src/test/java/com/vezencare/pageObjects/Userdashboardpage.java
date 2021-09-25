package com.vezencare.pageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Userdashboardpage {
	
	WebDriver ldriver;
	
	public Userdashboardpage(WebDriver rdriver) {
		
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
		}
	
	@FindBy(id="DdlFamilyMembers") 	//choose family members element
	WebElement Element;
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div[1]/div/div[1]/div/a")
	WebElement Physicalapp;
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div/a")
	WebElement Onlineapp;
	
	@FindBy(xpath="//h2[contains(text(),'General Medicine')]")
	WebElement generalmedicineh2;
	
	@FindBy(id="DdlState")
	WebElement State;
	
	@FindBy(id="DdlDistrict")
	WebElement District;
	
	@FindBy(id="DdlMandal")
	WebElement Mandal;
	
	@FindBy(id="txtDate")
	WebElement Date;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement Submitbtn;
	
	@FindBy(xpath="//button[contains(text(),'Request')]")
	WebElement Requestbtn;
	
	@FindBy(css="input[id='morning']")
	WebElement Timeschedule;
	
	@FindBy(id="A78")
	WebElement Confirmrequestbtn;
	
	@FindBy(xpath="//button[contains(text(),'Yes, I am sure!')]")
	WebElement Confirmationpopup;
	
	public void physicalApp() 
	{
		
		Physicalapp.click();
	}
	
	public void onllineApp() 
	{
		
		Onlineapp.click();
	}
	
	public void generalMedicineh2()
	{
		Actions action = new Actions(ldriver); //mouse move actions
		action.moveToElement(generalmedicineh2).perform();
		
	}
	
	
	public void state()
	{
		Select choosestate=new Select(State);
		choosestate.selectByValue("1");
	}
	
	public void dist()
	{
		Select choosedistrict=new Select(District);
		choosedistrict.selectByValue("11");
	}
	
	public void mandal()
	{
		Select choosemandal=new Select(Mandal);
		choosemandal.selectByVisibleText("Golugonda");
	}
	
	public void date()
	{
		Date.click();
		Date.sendKeys("26-09");
	}

	public void submitBtn()
	{
		Submitbtn.click();
	}
	
	public void requestBtn()
	{
		Requestbtn.click();
	}
	
	public void timeSchedule()
	{
		Timeschedule.click();
	}
	
	public void confirmRequestBtn()
	{
		Confirmrequestbtn.click();
	}
	
	public void confirmationPopup()
	{
		Confirmationpopup.click();
	}
	
}
