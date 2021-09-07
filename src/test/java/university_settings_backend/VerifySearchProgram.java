package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifySearchProgram extends DriverSetup {
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
			
			//Navigate to Programms
			WebElement program = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[3]/a/span"));
			program.click();
			Thread.sleep(1000);
			
			//Search Program
			WebElement search = driver.findElement(By.xpath("//*[@id=\"institutionprogram-table_filter\"]/label/input"));
			search.click();
			Thread.sleep(2000);
			search.sendKeys("135");
			Thread.sleep(2000);
			
			driver.close();
	}
}
