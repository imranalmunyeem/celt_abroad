package system_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Currencies_Add {
	
	@Test
	public void currencies_add_test() throws InterruptedException {
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
				
				
		//Navigate to currencies
		WebElement locale = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[1]/a/span"));
		locale.click();
		Thread.sleep(2000);
		WebElement currencies = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[2]/ul/li[2]/a/span"));
		currencies.click();
		Thread.sleep(2000);
		
		//Add Currency
		WebElement add_currency = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		add_currency.click();
		Thread.sleep(2000);
				
				 
		//Currency Code
		WebElement currency_code = driver.findElement(By.name("code"));
		currency_code .sendKeys("SWN");
		Thread.sleep(2000);
				
		//Currency Symbol
		WebElement currency_symbol = driver.findElement(By.name("symbol"));
		currency_symbol.sendKeys("KOR");
		Thread.sleep(2000);
				
		//USD Rate 
		WebElement usd_rate = driver.findElement(By.name("usd_rate"));
		usd_rate.sendKeys("98");
		Thread.sleep (2000);
				
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"currency-form\"]/div[4]/button"));
		submit.click();
		Thread.sleep(2000);
		
	}
}
