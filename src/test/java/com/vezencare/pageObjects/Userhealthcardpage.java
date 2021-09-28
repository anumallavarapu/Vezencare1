package com.vezencare.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userhealthcardpage {
WebDriver ldriver;
	
	public Userhealthcardpage(WebDriver rdriver) {
		
				ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
		}
	
	@FindBy(id="MyHealthCard")	
	WebElement Myhealthcard;
	
	@FindBy(xpath="//body/div[@id='wrapper']/center[1]/div[2]/a[1]")
	WebElement Downloadhealthcard;
	
	public void myHealthCard()
	{
		Myhealthcard.click();
	}
	
	public void downloadHealthCard()
	{
		Downloadhealthcard.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
