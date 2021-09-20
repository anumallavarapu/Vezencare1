package com.vezencare.testCases;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.vezencare.utilities.ReadConfig;

public class Userbaseclass {

	
	ReadConfig readconfig=new ReadConfig(); 
		
	public String baseURL= readconfig.getApplicationURL();
	public String memberusername=readconfig.getUsername();
	public String memberpassword=readconfig.getPassword();
	public static WebDriver driver;
		
	public static Logger logger1; 
	
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String br) {
		
		
		if(br == null || br == "")
			br = "chrome"; 
		//logger =Logger.getLogger("Vezencare");
		logger1 =LogManager.getLogger(Userbaseclass.class);
		//String log4jConfPath = "G:\\Eclipse-My Workspace\\Vezencare\\src\\test\\java\\Log4j2.properties";
		//PropertyConfigurator.configure(log4jConfPath);
		
		
		
		if(br.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			driver=new ChromeDriver();
		
		}
		
		else if(br.equals("firefox")) { 
			
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath()); 
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown() {
		
		driver.close();
	}











}


