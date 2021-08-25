package blog_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Action_Blog {
	@Test
	 public void action_test_blog() throws InterruptedException {
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
		
		
		//Navigate to Blog
		WebElement blog = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[5]/a/span"));
		blog.click();
		Thread.sleep(1000);
		
		//actions
		
		//Delete
		WebElement delete_blog = driver.findElement(By.xpath("//*[@id=\"blog_delete\"]/i"));
		delete_blog.click();
		Thread.sleep(1000);
		
		WebElement delettion_cancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		delettion_cancel.click();
		Thread.sleep(1000);
		
		
		//View
		WebElement eye_blog = driver.findElement(By.xpath("//*[@id=\"blog-table\"]/tbody/tr[1]/td[6]/a[2]/i"));
		eye_blog.click();
		Thread.sleep(1000);
		
		driver.navigate().back();  
		Thread.sleep(1000);
		
		
		//Edit
		WebElement edit_blog = driver.findElement(By.xpath("//*[@id=\"blog-table\"]/tbody/tr[1]/td[6]/a[1]/i"));
		edit_blog.click();
		Thread.sleep(1000);
		
		driver.navigate().back();  
		Thread.sleep(1000);
		driver.close();
		 
	 }

}
