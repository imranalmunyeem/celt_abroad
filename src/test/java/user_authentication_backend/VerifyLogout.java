package user_authentication_backend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogout {
	
	@Test
	public void LogoutTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
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
		Thread.sleep(1000);
		
		//Logout
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/nav/ul[1]/li/a"));
		logout.click();
		Thread.sleep(3000);
		
		WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/nav/ul[1]/li/div/a"));
		logoutButton.click();
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
