package celtabroad_frontend;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyPrivacyPolicyTermsConditionHelp {

	@Test
	public void PrivacyPolicyTermsConditionHelpTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Privacy and Policy
		driver.findElementByXPath("//a[@href='https://celtabroad.com/privacy-policy']").click();
		Thread.sleep(2000);
		
		//Terms and condition
		driver.findElementByXPath("/html/body/div[8]/div[2]/div/div/div/div[1]/a[2]").click();
		Thread.sleep(2000);
		
		
		//Help
		driver.findElementByXPath("/html/body/div[8]/div[2]/div/div/div/div[1]/a[3]").click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
