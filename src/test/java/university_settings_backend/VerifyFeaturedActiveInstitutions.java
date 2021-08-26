package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyFeaturedActiveInstitutions {
	@Test
	public void FeaturedActiveTest() throws InterruptedException {
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
		
		
		//Navigate to University Settings
		WebElement universitySettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span[1]"));
		universitySettings.click();
		Thread.sleep(1000);
		
		//Navigate to Representative
		WebElement representative = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[1]/a/span"));
		representative.click();
		Thread.sleep(1000);
		
		//Navigate to Institutions
		WebElement institutions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[2]/a/span"));
		institutions.click();
		Thread.sleep(1000);
		
		//isFeatured
		WebElement featured = driver.findElement(By.xpath("//*[@id=\"is_featured\"]"));
		featured.click();
		Thread.sleep(2000);
		
		WebElement cancelFeatured = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
		cancelFeatured.click();
		Thread.sleep(2000);
		
		WebElement okFeatured = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		okFeatured.click();
		Thread.sleep(2000);
		
		WebElement yesFeatured = driver.findElement(By.xpath("//*[@id=\"is_featured\"]"));
		yesFeatured.click();
		Thread.sleep(2000);
		
		WebElement continueFeatured = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		continueFeatured.click();
		Thread.sleep(2000);
		
		//isActive
		WebElement active = driver.findElement(By.xpath("//*[@id=\"is_active\"]"));
		active.click();
		Thread.sleep(2000);
				
		WebElement cancelActive = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
		cancelActive.click();
		Thread.sleep(2000);
				
		WebElement okActive = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		okActive.click();
		Thread.sleep(2000);
				
		WebElement yesActive= driver.findElement(By.xpath("//*[@id=\\\"is_active\\\"]"));
		yesActive.click();
		Thread.sleep(2000);
				
		WebElement continueActive = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		continueActive.click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
