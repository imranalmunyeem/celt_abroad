package celtabroad_frontend;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyLoginwithSocialMedia {

	@Test
	public void LoginWithSocialMediaTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//login_with_social_mediatest
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div[1]/div/div/div/nav/div/div[2]/div[5]/div[1]/button/span").click();
		Thread.sleep(1000);
		
		
		//login with Google
		driver.findElementByXPath("//*[@id=\"main-menu\"]/div/div/div/nav/div/div[2]/div[5]/div[3]/div[3]/div[1]/div/a[1]/img").click();
		driver.navigate().back();  
		Thread.sleep(1000);
		
		
		//login with Facebook
		driver.findElementByXPath("/html/body/div[1]/div/div/div/nav/div/div[2]/div[5]/div[1]/button/span").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"main-menu\"]/div/div/div/nav/div/div[2]/div[5]/div[3]/div[3]/div[1]/div/a[2]/img").click();
		driver.navigate().back();  
		Thread.sleep(1000);
				
		
		//login with Linkedin
		driver.findElementByXPath("/html/body/div[1]/div/div/div/nav/div/div[2]/div[5]/div[1]/button/span").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@id=\"main-menu\"]/div/div/div/nav/div/div[2]/div[5]/div[3]/div[3]/div[1]/div/a[3]/img").click();
		driver.navigate().back();  
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
