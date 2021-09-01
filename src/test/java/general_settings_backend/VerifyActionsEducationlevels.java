package general_settings_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyActionsEducationlevels {
	@Test
	public void ActionsTest() throws InterruptedException {
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
		
		//Click on Add
		WebElement clickAdd = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		clickAdd.click();
		Thread.sleep(1000);
		
		//Select En
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(1000);
		
		//Education Level
		WebElement educationLevel= driver.findElement(By.xpath("//*[@id=\"en_title\"]"));
		educationLevel.click();
		Thread.sleep(1000);
		educationLevel.sendKeys("Tester");
		Thread.sleep(1000);
		
		//Education level Description
		WebElement description = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
		description.click();
		Thread.sleep(1000);
		description.sendKeys("Automation Tester");
		Thread.sleep(1000);
		
		//Submit Education Level 
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"education-level-form\"]/div/div/div[6]/button"));
		submitButton.click();
		Thread.sleep(1000);
		
		driver.close();
		
	}
}
