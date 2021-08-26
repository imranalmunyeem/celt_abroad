package celtabroad_frontend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyNewsletter {

	@Test
	public void NewsletterTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		
		WebElement newsletter = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div[4]/ul/form/input"));
		newsletter.sendKeys("imran@automation.com");
		WebElement subscribe = driver.findElement(By.xpath("/html/body/div[8]/div[1]/div/div/div[4]/ul/form/button"));
		subscribe.click();
		Thread.sleep(2000);
		driver.close();
	
	}
}
