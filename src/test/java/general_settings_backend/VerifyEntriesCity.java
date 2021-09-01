package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyEntriesCity {
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
		
		//Navigate to City
		WebElement city = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[7]/a/span"));
		city.click();
		Thread.sleep(1000);
		
		//entries
		WebElement entriesCountries = driver.findElement(By.xpath("//*[@id=\"city_datatables_length\"]/label/select"));
		entriesCountries.click();
		Thread.sleep(2000);
		
		//Entry List
		
		//10
		driver.findElementByXPath("//*[@id=\"city_datatables_length\"]/label/select/option[1]").click();
		Thread.sleep(1000);
		entriesCountries.click();
		Thread.sleep(1000);
						
		//25
		driver.findElementByXPath("//*[@id=\"city_datatables_length\"]/label/select/option[1]").click();
		Thread.sleep(1000);
		entriesCountries.click();
		Thread.sleep(1000);
						
		//50
		driver.findElementByXPath("//*[@id=\"city_datatables_length\"]/label/select/option[2]").click();
		Thread.sleep(1000);
		entriesCountries.click();
		Thread.sleep(1000);
						
		//100
		driver.findElementByXPath("//*[@id=\"city_datatables_length\"]/label/select/option[3]").click();
		Thread.sleep(1000);
		entriesCountries.click();
		Thread.sleep(2000);
						
		driver.close();
	}
}
