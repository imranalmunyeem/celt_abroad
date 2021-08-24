package user_authentication_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyForgotPassword {

	@Test(priority=1,description="it will check the reset password functionality")
	public void forgotpassword_test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//forgot your password
		WebElement forgot_password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[5]/div/a"));
		forgot_password.click();
		Thread.sleep(1000);
		
		
		driver.close();
	}
}
