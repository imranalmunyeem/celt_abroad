package system_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Locale_Action {
	
	@Test
	public void locale_action_test() throws InterruptedException {
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
		
		//Action
		//Default
		WebElement make_default = driver.findElement(By.xpath("//*[@id=\"default_lang\"]/i"));
		make_default.click();
		Thread.sleep(3000);
		
		WebElement cancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
		cancel.click();
		
		
		//Add
		WebElement add = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		add.click();
		Thread.sleep(3000);
		
		
		//Add Locale
		WebElement add_locale = driver.findElement(By.xpath("//*[@id=\"locale\"]"));
		add_locale.sendKeys("SP");
		Thread.sleep(3000);
		
		 
		//Add Title
		WebElement add_title = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		add_title.sendKeys("Spain");
		Thread.sleep(3000);
		
		
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"locale-form\"]/div[3]/button"));
		submit.click();
		Thread.sleep(3000);
		
		//Delete
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"locale_delete\"]"));
		delete.click();
		Thread.sleep(3000);
	    
		//Cancel the Deletion Process
	    WebElement deletion_cancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
	    deletion_cancel.click();
	    Thread.sleep(2000);
	    
	    driver.close();
	}
}
