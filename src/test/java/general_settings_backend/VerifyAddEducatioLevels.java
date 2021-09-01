package general_settings_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyAddEducatioLevels {
	@Test
	public void AddTest() throws InterruptedException {
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
		
		
		//Navigate to Education Levels
		WebElement educationLevels = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[9]/a/span"));
		educationLevels.click();
		Thread.sleep(1000);
		
		//Delete
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"edu_delete\"]"));
		delete.click();
		Thread.sleep(1000);
		
		//Cancel Delete
		WebElement cancelDelete = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelDelete.click();
		Thread.sleep(1000);
		
		//cancel ok
		WebElement cancelOk = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelOk.click();
		Thread.sleep(1000);
		
		//View
		WebElement view = driver.findElement(By.xpath("//*[@id=\"educationlevel-table\"]/tbody/tr[2]/td[4]/a[2]"));
		view.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		//Edit
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"educationlevel-table\"]/tbody/tr[2]/td[4]/a[1]"));
		edit.click();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.close();
		
	}
}
