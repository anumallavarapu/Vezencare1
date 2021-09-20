import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Sampletestcase {


		public void launchbrowser(){
			
			System.setProperty("webdriver.chrome.driver", "G:\\Selenium Installers\\drivers\\chromedriver.exe");
			
			 
			WebDriver driver=  new ChromeDriver();
			driver.get("https://qa.vezencare.com/Home/UserLogin");
			
			driver.findElement(By.id("txtUserName")).sendKeys("9346078959");
			driver.findElement(By.name("login-form-password")).sendKeys("1234");;
			
			driver.findElement(By.name("login-form-submit")).click();;
			
		
		}
		
		
		public static void main(String[] args) {
			
			Sampletestcase obj= new Sampletestcase();
			obj.launchbrowser();
			
		}


	}


