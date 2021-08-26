package menubutton_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyHeaderMenuButton {
	
	@Test
	public void MenuButtonTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Login
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("salman.auvi@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("12345678");
		Thread.sleep(1000);
	
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
		login.click();
		Thread.sleep(1000);
		
		//Menu Button
		WebElement button = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[1]/nav/ul[2]/li/button"));
		button.click();
		Thread.sleep(1500);
		button.click();
		Thread.sleep(1500);
		button.click();
		Thread.sleep(2000);
		driver.close();
		
	}
}
