package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyActionsInstitutions extends DriverSetup{
	@Test
	public void ActionsTest() throws InterruptedException {
		
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
		
		
		//Navigate to University Settings
		WebElement universitySettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span[1]"));
		universitySettings.click();
		Thread.sleep(1000);
		
		//Navigate to Representative
		WebElement representative = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[1]/a/span"));
		representative.click();
		Thread.sleep(1000);
		
		//Navigate to Institutions
		WebElement institutions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[2]/a/span"));
		institutions.click();
		Thread.sleep(1000);
		
		//Actions
		//Delete
		WebElement deleteInstitutions = driver.findElement(By.xpath("//*[@id=\"institution_delete\"]"));
		deleteInstitutions.click();
		Thread.sleep(1000);
		
		WebElement deleteCancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		deleteCancel.click();
		Thread.sleep(1000);
		
		WebElement okInstitutions = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		okInstitutions.click();
		Thread.sleep(1000);
		
		//View
		WebElement viewInstitutions = driver.findElement(By.xpath("//*[@id=\"institution-table\"]/tbody/tr[2]/td[7]/a[2]"));
		viewInstitutions.click();
		Thread.sleep(1000);
		
		driver.navigate().back();  	
		
		//Edit
		WebElement editInstitutions = driver.findElement(By.xpath("//*[@id=\"institution-table\"]/tbody/tr[1]/td[7]/a[1]"));
		editInstitutions.click();
		Thread.sleep(1000);
		
		WebElement editEn = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		editEn.click();
		Thread.sleep(1000);
		
	
				
		//Submit
		WebElement submitInstitution = driver.findElement(By.xpath("//*[@id=\"institution-form\"]/div[13]/button"));
		submitInstitution.click();
		Thread.sleep(1000);
		
		driver.close();
		
		//About
	}

}
