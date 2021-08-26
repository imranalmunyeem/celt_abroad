package user_authentication_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyForgotPassword {

	@Test
	public void ForgotPasswordTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//forgot your password
		WebElement forgotPassword = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[5]/div/a"));
		forgotPassword.click();
		Thread.sleep(1000);
		
		
		driver.close();
	}
}
