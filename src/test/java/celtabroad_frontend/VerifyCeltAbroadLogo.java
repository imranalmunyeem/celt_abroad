package celtabroad_frontend;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class VerifyCeltAbroadLogo {
	
	@Test
	public void LogoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//celtabroad_logo_test
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//*[@id=\"main-menu\"]/div/div/div/nav/a").click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
