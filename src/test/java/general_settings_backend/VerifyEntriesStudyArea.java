package general_settings_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyEntriesStudyArea {
	@Test
	public void EntriesTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();		
		
		//input email
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("salman.auvi@gmail.com");
		Thread.sleep(1000);
		
		
		//input password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
	
		
		//Login Button
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		login.click();
		Thread.sleep(2000);
		
		
		//Navigate to General Settings
		WebElement generalSettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/a/span[1]"));
		generalSettings.click();
		Thread.sleep(1000);
		
		
		//Navigate to Study Area
		WebElement StudyArea = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[10]/a/span"));
		StudyArea.click();
		Thread.sleep(1000);
		
		//Entry List
		WebElement EntryList = driver.findElement(By.xpath("//*[@id=\"studyareadatatable-table_length\"]/label/select"));
		Thread.sleep(1000);
		EntryList.click();
		Thread.sleep(1000);
							
		//10
		driver.findElementByXPath("//*[@id=\"studyareadatatable-table_length\"]/label/select/option[1]").click();
		Thread.sleep(1000);
		EntryList.click();
		Thread.sleep(1000);
								
		//25
		driver.findElementByXPath("//*[@id=\"studyareadatatable-table_length\"]/label/select/option[2]").click();
		Thread.sleep(1000);
		EntryList.click();
		Thread.sleep(1000);
								
		//50
		driver.findElementByXPath("//*[@id=\"studyareadatatable-table_length\"]/label/select/option[3]").click();
		Thread.sleep(1000);
		EntryList.click();
		Thread.sleep(1000);
								
		//100
		driver.findElementByXPath("//*[@id=\"studyareadatatable-table_length\"]/label/select/option[4]").click();
		Thread.sleep(1000);
		EntryList.click();
		Thread.sleep(2000);
								
		driver.close();
	}
}
