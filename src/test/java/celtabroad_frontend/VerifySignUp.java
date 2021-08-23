package celtabroad_frontend;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifySignUp {
	
	@Test
	public void signup_test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		
		//sign up 
		driver.findElementByXPath("//*[@id=\"user\"]/span").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"main-menu\"]/div/div/div/nav/div/div[2]/div[5]/div[3]/div[3]/div[3]/div[2]/a").click();
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("automation");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("automation@tester.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"registerSubmit2\"]").click();
		driver.findElement(By.id("signup_otp")).sendKeys("1234");
		driver.findElementByXPath("//*[@id=\"check_otp\"]").click();
		driver.close();
		
		
		

}
}