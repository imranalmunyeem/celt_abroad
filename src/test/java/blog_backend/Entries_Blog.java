package blog_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Entries_Blog {
	@Test
	public void entries_test_blog() throws InterruptedException {
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
		
		
		//Navigate to Blog
		WebElement blog = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[5]/a/span"));
		blog.click();
		Thread.sleep(1000);
		
		//entries
		WebElement entries_blog = driver.findElement(By.xpath("//*[@id=\"blog-table_length\"]/label/select"));
		entries_blog.click();
		Thread.sleep(2000);
				
				
		//Entry List
				
		//10
		driver.findElementByXPath("///*[@id=\"blog-table_length\"]/label/select/option[1]").click();
		Thread.sleep(1000);
		entries_blog.click();
		Thread.sleep(1000);
				
		//25
		driver.findElementByXPath("//*[@id=\"blog-table_length\"]/label/select/option[2]").click();
		Thread.sleep(1000);
		entries_blog.click();
		Thread.sleep(1000);
				
		//50
		driver.findElementByXPath("//*[@id=\"blog-table_length\"]/label/select/option[3]").click();
		Thread.sleep(1000);
		entries_blog.click();
		Thread.sleep(1000);
				
		//100
		driver.findElementByXPath("//*[@id=\"blog-table_length\"]/label/select/option[4]").click();
		Thread.sleep(1000);
		entries_blog.click();
		Thread.sleep(1000);
				
		driver.close();
		
	}
}
