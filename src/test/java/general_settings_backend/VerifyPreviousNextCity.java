package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyPreviousNextCity {
	@Test
	public void TestPreviousNext() throws InterruptedException {
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
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(1000);
		
		//Next 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"city_datatables_next\"]/a"));
		next.click();
		Thread.sleep(1000);
		
		//Previous
		WebElement previous = driver.findElement(By.xpath("//*[@id=\"city_datatables_previous\"]"));
		previous.click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
