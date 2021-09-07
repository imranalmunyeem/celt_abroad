package blog_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import base_class.DriverSetup;

public class SearchBlog extends DriverSetup {
	@Test
	public void SearchTest() throws InterruptedException {

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
		
		//Search
		WebElement searchBlog = driver.findElement(By.xpath("//*[@id=\"blog-table_filter\"]/label/input"));
		searchBlog.click();
		Thread.sleep(2000);
		searchBlog.sendKeys("Scholarship");
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
