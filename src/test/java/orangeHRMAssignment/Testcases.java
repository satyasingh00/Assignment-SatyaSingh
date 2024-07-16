package orangeHRMAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcases {
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver(); // Initialize the ChromeDriver
		
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Navigate to the OrangeHRM demo login page
		
	}
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        Thread.sleep(2000);
        
        
	}
	
	@Test
	public void Search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Claim");
		Thread.sleep(2000);
	}
	
	@Test
	public void  Admin() {
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[1]")).sendKeys("Ankit3539");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	public void PIM() {
		driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
		
	}
	
	@Test
	public void Logout() throws InterruptedException {
		 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
	}
	
	@AfterClass
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
	

}
