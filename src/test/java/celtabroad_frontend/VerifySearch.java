package celtabroad_frontend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifySearch {

	@Test
	public void search_test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			
		driver.get("https://celtabroad.com/");
		driver.manage().window().maximize();
		
		// Search
		WebElement search = driver.findElement(By.xpath("//*[@id=\"navSearch\"]"));
	    search.sendKeys("testing blog");
	    driver.findElementByXPath("//*[@id=\"main-menu\"]/div/div/div/nav/div/div[1]/form/button/i").click();
		Thread.sleep(2000);

		
		
		
	}
}
