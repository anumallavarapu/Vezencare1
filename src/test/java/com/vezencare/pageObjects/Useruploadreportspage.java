package com.vezencare.pageObjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Useruploadreportspage {

	WebDriver ldriver;
	public static Logger _logger =LogManager.getLogger(Userloginpage.class);;
	
	public Useruploadreportspage(WebDriver rdriver){	
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this); 
	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[15]/a[1]/div[1]")
	WebElement Uploadreports;
	
	@FindBy(id="txtHospitalID")
	WebElement Searcforhospital;
	
	@FindBy(id="ddlDoctor")
	WebElement Doctorname;
	
	@FindBy(id="ddlDoctorSpecializations")
	WebElement Selectspecialization;
	
	@FindBy(id="UserReports")
	WebElement Uploadmedicalreports;
	
	@FindBy(id="txtIssue")
	WebElement Problem;
	
	@FindBy(id="txtDate")
	WebElement Reportdate;
	
	@FindBy(xpath="//button[contains(text(),'Upload')]")
	WebElement Uploadbtn;
	
	@FindBy(xpath="//button[contains(text(),'Yes, I am sure!')]")
	WebElement Confirmationpopup;
	
	public void uploadReports()
	{
		Uploadreports.click();
	}
	
	public void searchForHospital() throws InterruptedException {
		 String textToSelect = "Test Hospital1, Golugonda, VISAKHAPATNAM";
		// 1. Key-in text box
		 // 2. wait some time
		 // 3. find UL list
		 Searcforhospital.sendKeys("Test");
		 Thread.sleep(3000);
		 WebElement autoOptions= ldriver.findElement(By.id("ui-id-1"));
		    
		
		 WebDriverWait wait=new WebDriverWait(ldriver, 50); 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-id-1")));
		
		   

		    List<WebElement> optionsToSelect = ldriver.findElements(By.tagName("li"));
		    Thread.sleep(3000);
		    for(WebElement option : optionsToSelect){
		        System.out.println(option);
		        if(option.getText().equals(textToSelect)) {
		            System.out.println("Trying to select: "+textToSelect);
		            option.click();
		            //Searcforhospital.sendKeys(option.getText());
		            break;
		        
		        }
		    }
	}
	
	public void doctorName()
	{
		Select choosedoctorname=new Select(Doctorname);
		choosedoctorname.selectByVisibleText("hi");
	}
	
	public void selectSpecialization()
	{
		Select chooseselectspecialization=new Select(Selectspecialization);
		chooseselectspecialization.selectByIndex(1);;
	}
	
	public void uploadMedicalReports()
	{
		Uploadmedicalreports.sendKeys("C:\\Users\\ANUSHA\\Downloads\\341192701.pdf");
	}
	
	public void problem()
	{
		Problem.sendKeys("pain");
	}
	
	public void reportDate()
	{
		Reportdate.sendKeys("15-09");
	}
	
	public void uploadBtn()
	{
		Uploadbtn.click();
	}

	public void confirmationPopUp()
	{
		Confirmationpopup.click();
	}
	
	
	
	
}
