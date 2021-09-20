package com.UserTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreportsbasicdemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlreporter=new ExtentHtmlReporter("extent.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlreporter);
		
        ExtentTest test1 = extent.createTest("vezencare book now option", "this is test to validate book now option");
        
        System.setProperty("webdriver.chrome.driver", "./src/main/java/chromedriver.exe");
        driver=new ChromeDriver();
       
        test1.log(Status.INFO, "Starting testcase");
        driver.get("https://qa.vezencare.com/Home/CaretakerLogin");
        test1.pass("Browser launched");
        
        driver.findElement(By.id("txtUserName")).sendKeys("9346078959");
        test1.pass("entered caretaker username");
      
        driver.findElement(By.id("txtPassword")).sendKeys("1234");
        test1.pass("entered caretaker password");
        
        driver.findElement(By.id("login-form-submit")).click();
        test1.pass("clicked on login button");
        
        driver.close(); 
        driver.quit();
        test1.pass("closed broswer");
        
        test1.info("test has been completed");
        extent.flush();

	}

}
