package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyAddUniversityRepresentatives {
	@Test
	public void AddTestUniversityRepresentatives() throws InterruptedException {
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
		
		//Add Representative
		WebElement addRepresentative = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		addRepresentative.click();
		Thread.sleep(1000);
		
		
		//Input fields
		//Name
		WebElement addName = driver.findElement(By.name("name"));
		addName.click();
		Thread.sleep(1000);
		addName.sendKeys("IMRAN");
		Thread.sleep(1000);
		
		//Email
		WebElement addEmail = driver.findElement(By.name("email"));
		addEmail.click();
		Thread.sleep(1000);
		addEmail.sendKeys("imran@automation.com");
		Thread.sleep(1000);
		
		//Submit
		WebElement submitRepresentative = driver.findElement(By.xpath("//*[@id=\"university-form\"]/div[3]/button"));
		submitRepresentative.click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
