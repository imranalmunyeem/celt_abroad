package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyAddSession extends DriverSetup {
	@Test
	public void AddTest() throws InterruptedException {
	
		
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();		
		
		//input email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("salman.auvi@gmail.com");
		Thread.sleep(1000);
		
		
		//input password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
	
		
		//Login Button
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		login.click();
		Thread.sleep(2000);
		
		//Navigate to General Settings
		WebElement generalSettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/a/span[1]"));
		generalSettings.click();
		Thread.sleep(1000);
		
		//Navigate to Session
		WebElement session = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[8]/a/span"));
		session.click();
		Thread.sleep(1000);
		
		//Add Session
		WebElement clickAdd = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		clickAdd.click();
		Thread.sleep(1000);
		
		//En
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(1000);
		
		//Session Name
		WebElement sessionName = driver.findElement(By.xpath("//*[@id=\"en_session_name\"]"));
		sessionName.click();
		Thread.sleep(1000);
		sessionName.sendKeys("Last");
		Thread.sleep(1000);
		
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"study-type-form\"]/div/div/div[6]/button"));
		submit.click();
		Thread.sleep(1000);
		
		driver.close();
		
		
	}
}
