package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Action_Region {
	@Test
	public void action_test_region() throws InterruptedException {
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
		WebElement general_settings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/a/span[1]"));
		general_settings.click();
		Thread.sleep(1000);
		
		
		//Navigate to Languages
		WebElement languages = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[1]/a/span"));
		languages.click();
		Thread.sleep(1000);
		
		
		//Navigate to Regions
		WebElement regions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[2]/a/span"));
		regions.click();
		Thread.sleep(1000);
		
		//actions
		
		//Delete
		WebElement delete_regions = driver.findElement(By.xpath("//*[@id=\"region_program_delete\"]/i"));
		delete_regions.click();
		Thread.sleep(1000);
		
		WebElement delettion_cancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		delettion_cancel.click();
		Thread.sleep(1000);
		
		WebElement ok_regions = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		ok_regions.click();
		Thread.sleep(1000);
		
		
		//Edit
		WebElement edit_regions = driver.findElement(By.xpath("//*[@id=\"region_datatable-table\"]/tbody/tr[6]/td[4]/a/i"));
		edit_regions.click();
		Thread.sleep(1000);
		
		WebElement title_regions = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		title_regions.click();
		Thread.sleep(1000);
		

		WebElement name_regions = driver.findElement(By.xpath("//*[@id=\"en_title\"]"));
		name_regions.click();
		Thread.sleep(1000);
		name_regions.clear();
		Thread.sleep(1000);
		name_regions.sendKeys("United Kingdom");
		Thread.sleep(1000);
		
		//Submit
		WebElement submit_regions = driver.findElement(By.xpath("//*[@id=\"session-type-form\"]/div/div/div[6]/button"));
		submit_regions.click();
		Thread.sleep(1000);
	
		
		driver.navigate().back();  
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
