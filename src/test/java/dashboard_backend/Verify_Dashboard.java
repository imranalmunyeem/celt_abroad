package dashboard_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Dashboard {

		@Test
		public void dashboard_link_test () throws InterruptedException{
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
			
			//Dashboard
			WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[1]/a/span"));
			dashboard.click();
			Thread.sleep(3000);
			driver.close();
		}
}
