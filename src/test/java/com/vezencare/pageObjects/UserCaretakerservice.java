package com.vezencare.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserCaretakerservice {
WebDriver ldriver;
	
	public UserCaretakerservice(WebDriver rdriver) {
		
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
	
}

	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div[4]/div/div[1]/div/a")
	WebElement Caretakerservice;
	
	@FindBy(id="DDlCareTakerServiceFor")
	WebElement Servicefor;
	
	@FindBy(id="txtServiceDate")
	WebElement Servicedate;
	
	@FindBy(id="DDLTimeSlots")
	WebElement Timeslot;
	
	@FindBy(id="txtCno")
	WebElement Contactphno;
	
	@FindBy(id="txtCPerName")
	WebElement Contactpername;
	
	@FindBy(id="ChkCareTaker")
	WebElement Selectaddress;
	
	@FindBy(id="txtAddres")
	WebElement Enteraddress;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Caretakersubbtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[4]/div[2]/button[1]")	
	WebElement Confirmationpopup;
	
	public void careTakerService()
	{
		Caretakerservice.click();
	}
	
	public void serviceFor()
	{
		Select chooseservice=new Select(Servicefor);
		chooseservice.selectByVisibleText("Hospital Assistance");
	}
	
	public void serviceDate()
	{
		Servicedate.click();
		Servicedate.sendKeys("26-09");
	}

	public void timeSlot()
	{
		Select choosetimeslot=new Select(Timeslot);
		choosetimeslot.selectByIndex(3);	
	}
	
	public void contactPhNo()
	{
		Contactphno.sendKeys("9346078959");
	}

	public void contactPerName()
	{
		Contactpername.sendKeys("anusha");
	}
	
	public void selectAddress()
	{
		Selectaddress.click();
	}

	public void enterAddress()
	{
		Enteraddress.sendKeys("amaravathi");
	}
	
	public void careTakerSubBtn()
	{
		Caretakersubbtn.click();
	}
	public void confirmationPopup()
	{
		Confirmationpopup.click();
	}


}
