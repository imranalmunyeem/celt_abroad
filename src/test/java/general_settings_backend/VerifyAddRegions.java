package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class VerifyAddRegions extends DriverSetup {
	@Test
	public void verifyTestRegions() throws InterruptedException {
		
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
		
		
		//Navigate to Languages
		WebElement languages = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[1]/a/span"));
		languages.click();
		Thread.sleep(1000);
		
		
		//Navigate to Regions
		WebElement regions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[2]/a/span"));
		regions.click();
		Thread.sleep(1000);
		
		
		//Navigate to add
		WebElement addNavigate = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		addNavigate.click();
		Thread.sleep(1000);
		
		//Add Region
		WebElement addRegions = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		addRegions.click();
		Thread.sleep(2000);
		WebElement titleRegions = driver.findElement(By.xpath("//*[@id=\"en_title\"]"));
		titleRegions.click();
		titleRegions.sendKeys("UK");
		Thread.sleep(2000);
		
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"study-type-form\"]/div/div/div[6]/button"));
		submit.click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
