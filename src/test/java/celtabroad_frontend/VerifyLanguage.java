package celtabroad_frontend;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLanguage {
	
	@Test
	public void LanguageTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		
		
		//Language
		driver.findElementByXPath("//*[@id=\"lang\"]/span").click();
		Thread.sleep(1000);
		
		//Azerbaijani
		driver.findElementByXPath("//*[@id=\"get-locale-1\"]").click();
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"lang\"]/span").click();
		Thread.sleep(1000);
		
		//English
		driver.findElementByXPath("//*[@id=\"get-locale-2\"]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"lang\"]/span").click();
		Thread.sleep(1000);
		
		//Russian
		driver.findElementByXPath("//*[@id=\"get-locale-3\"]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//*[@id=\"lang\"]/span").click();
		Thread.sleep(1000);
		
		
		//Turkish
		driver.findElementByXPath("//*[@id=\"get-locale-4\"]").click();
		Thread.sleep(1000);
		
		driver.close();
	
		
		
		
		
		
	}
}
