package com.vezencare.pageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	
	public void Physicalapp() 
	{
		
		Physicalapp.click();
	}
	
	
	
	

}
