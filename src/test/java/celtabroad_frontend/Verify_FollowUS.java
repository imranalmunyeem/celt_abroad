package celtabroad_frontend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_FollowUS {
	@Test
	public void followus_test() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("/html/body/div[8]/div[1]/div/div/div[3]/ul/li[1]").click();
		//Facebook
		WebElement facebook = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div[3]/ul/li[2]/a[1]/img"));
		facebook.click();
		
		//Instagram
		
		//Twitter
		
		//Linkedin
		
	}
}
