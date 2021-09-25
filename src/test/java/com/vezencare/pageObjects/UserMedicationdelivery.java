package com.vezencare.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserMedicationdelivery {
	
WebDriver ldriver;
	
	public UserMedicationdelivery(WebDriver rdriver) {
		
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
		}
	
	@FindBy(xpath="/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div[3]/div/div[1]/div/a")
	WebElement Medicationdelivery;
	
	@FindBy(id="DdlMedicationDelivery")
	WebElement Meddelpriority;
	
	@FindBy(id="txtDrName")
	WebElement Drname;
	
	@FindBy(id="txtHptlName")
	WebElement Hptname;
	
	@FindBy(id="txtpharmacy")
	WebElement Pharname;
	
	@FindBy(id="txtPhoneNo")
	WebElement Contactphno;
	
	@FindBy(id="txtPersonName")
	WebElement Contactpername;
	
	@FindBy(id="txtAddres")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='Medication']")
	WebElement Choosefile;
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Meddelsubbtn;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[4]/div[2]/button[1]")	
	WebElement Confirmationpopup;
	
	
	public void medicationDelivery()
	{
		Medicationdelivery.click();
	}
	
	public void medDelPriority()
	{
		Select choosepriority=new Select(Meddelpriority);
		choosepriority.selectByVisibleText("As early as possible");
	}
	
	public void drName()
	{
		Drname.sendKeys("anusha");		
	}
	
	public void hptName()
	{
		Hptname.sendKeys("test1");
	}
	
	public void pharName()
	{
		Pharname.sendKeys("Yokshitha Pharmacy");
	}
	
	public void contactPhNo()
	{
		Contactphno.sendKeys("9346078959");
	}
	
	public void contactPerName()
	{
		Contactpername.sendKeys("anusha");
	}
	
	public void address()
	{
		Address.sendKeys("Guntur");
	}
	
	public void chooseFile()
	{
		
		Choosefile.sendKeys("C:\\Users\\ANUSHA\\Downloads\\baby image213043826.jpg");
	}
	
	public void medDelSubBtn()
	{
		Meddelsubbtn.click();
	}

	public void confirmationPopup()
	{
		Confirmationpopup.click();
	}

}
