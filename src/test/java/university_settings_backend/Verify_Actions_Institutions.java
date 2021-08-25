package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Actions_Institutions {
	@Test
	public void actions_test() throws InterruptedException {
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
		
		//Navigate to Institutions
		WebElement institutions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[2]/a/span"));
		institutions.click();
		Thread.sleep(1000);
		
		//Actions
		//Delete
		WebElement delete_institutions = driver.findElement(By.xpath("//*[@id=\"institution_delete\"]"));
		delete_institutions.click();
		Thread.sleep(1000);
		
		WebElement delete_cancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		delete_cancel.click();
		Thread.sleep(1000);
		
		WebElement ok_institutions = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		ok_institutions.click();
		Thread.sleep(1000);
		
		//View
		WebElement view_institutions = driver.findElement(By.xpath("//*[@id=\"institution-table\"]/tbody/tr[2]/td[7]/a[2]"));
		view_institutions.click();
		Thread.sleep(1000);
		
		driver.navigate().back();  	
		
		//Edit
		WebElement edit_institutions = driver.findElement(By.xpath("//*[@id=\"institution-table\"]/tbody/tr[1]/td[7]/a[1]"));
		edit_institutions.click();
		Thread.sleep(1000);
		
		WebElement edit_en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		edit_en.click();
		Thread.sleep(1000);
		
	
				
		//Submit
		WebElement submit_institution = driver.findElement(By.xpath("//*[@id=\"institution-form\"]/div[13]/button"));
		submit_institution.click();
		Thread.sleep(1000);
		
		driver.close();
		
		//About
	}

}
