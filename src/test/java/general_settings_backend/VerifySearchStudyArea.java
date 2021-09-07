package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifySearchStudyArea extends DriverSetup {
	@Test
	public void SearchTest() throws InterruptedException {
		
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
		
		
		//Navigate to Study Area
		WebElement StudyArea = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[10]/a/span"));
		StudyArea.click();
		Thread.sleep(1000);
		
		
		//Search
		WebElement SearchStudyArea = driver.findElement(By.xpath("//*[@id=\"studyareadatatable-table_filter\"]/label/input"));
		SearchStudyArea.click();
		Thread.sleep(1000);
		SearchStudyArea.sendKeys("7");
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
