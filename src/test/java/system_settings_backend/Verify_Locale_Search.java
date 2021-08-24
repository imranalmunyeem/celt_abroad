package system_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Locale_Search {
	
	@Test
	public void locale_search_test() throws InterruptedException {
		
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
		Thread.sleep(1000);
		
		
		//system_settings
		WebElement system_settings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/a/span[1]"));
		system_settings.click();
		Thread.sleep(2000);
				
				
		//Navigate to locale 
		WebElement locale = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[1]/a/span"));
		locale.click();
		Thread.sleep(2000);
		WebElement currencies = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[2]/a/span"));
		currencies.click();
		Thread.sleep(2000);
		
		
		//Search
		WebElement search_currencies = driver.findElement(By.xpath("//*[@id=\"currency-table_filter\"]/label/input"));
		Thread.sleep(1000);
		search_currencies.sendKeys("GBP");
		Thread.sleep(2000);
		search_currencies.click();
		Thread.sleep(2000);
		
		driver.close();
		
	}
		
	}

