package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Add_UniversityRepresentatives {
	@Test
	public void add_test_university_representatives() throws InterruptedException {
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
		WebElement university_settings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span[1]"));
		university_settings.click();
		Thread.sleep(1000);
		
		//Navigate to Representative
		WebElement representative = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[1]/a/span"));
		representative.click();
		Thread.sleep(1000);
		
		//Add Representative
		WebElement add_representative = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		add_representative.click();
		Thread.sleep(1000);
		
		
		//Input fields
		//Name
		WebElement add_name = driver.findElement(By.name("name"));
		add_name.click();
		Thread.sleep(1000);
		add_name.sendKeys("IMRAN");
		Thread.sleep(1000);
		
		//Email
		WebElement add_email = driver.findElement(By.name("email"));
		add_email.click();
		Thread.sleep(1000);
		add_email.sendKeys("imran@automation.com");
		Thread.sleep(1000);
		
		//Submit
		WebElement submit_representative = driver.findElement(By.xpath("//*[@id=\"university-form\"]/div[3]/button"));
		submit_representative.click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
