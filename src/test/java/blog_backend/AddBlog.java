package blog_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class AddBlog extends DriverSetup {
	@Test
	public void AddTest() throws InterruptedException {
	
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
		
		
		//Add
		WebElement addBlog = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		addBlog.click();
		Thread.sleep(2000);
		
		
		//Upload File
		WebElement chooseFile = driver.findElement(By.id("blog_img"));
		Thread.sleep(2000);
		chooseFile.sendKeys("C:\\\\upload\\\\bike.jpg");
		
		
		//Add
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(2000);
		
		
		//choose blog category 
		WebElement blogCategory = driver.findElement(By.xpath("//*[@id=\"en[category_id]\"]"));
		blogCategory.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\\\"en[category_id]\\\"]/option[4]")).click();
		//driver.findElement("//*[@id=\"en[category_id]\"]/option[4]").click();
		Thread.sleep(2000);
		
		
		//Blog Title 
		WebElement blogTitle = driver.findElement(By.xpath("//*[@id=\"en[title]\"]"));
		blogTitle.sendKeys("Bike");
		Thread.sleep(2000);
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(1000);
		
		
		//File
		WebElement file = driver.findElement(By.xpath("//*[@id=\"mceu_53-open\"]/span"));
		file.click();
		Thread.sleep(1000);
		file.click();
		Thread.sleep(1000);
		
		
		//Edit
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"mceu_54-open\"]/span"));
		edit.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		
		//Insert
		WebElement insert = driver.findElement(By.xpath("//*[@id=\"mceu_55-open\"]/span"));
		insert.click();
		Thread.sleep(2000);
		insert.click();
		Thread.sleep(2000);
		
		
		//View
		WebElement view = driver.findElement(By.xpath("//*[@id=\"mceu_56-open\"]/span"));
		view.click();
		Thread.sleep(1000);
		view.click();
		Thread.sleep(1000);
		
		
		//Format
		WebElement format = driver.findElement(By.xpath("//*[@id=\"mceu_57-open\"]/span"));
		format.click();
		Thread.sleep(1000);
		format.click();
		Thread.sleep(1000);
		
		
		//Table
		WebElement table = driver.findElement(By.xpath("//*[@id=\"mceu_59-open\"]/span"));
		table.click();
		Thread.sleep(1000);
		table.click();
		Thread.sleep(1000);
		
		
		//Tools
		WebElement tools = driver.findElement(By.xpath("//*[@id=\"mceu_60-open\"]/span"));
		tools.click();
		Thread.sleep(1000);
		tools.click();
		Thread.sleep(1000);
		
     
		//Submit
		WebElement blogSubmit = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div/form/div[2]/div/div[6]/button"));
		blogSubmit.click();
		Thread.sleep(2000);
		
		
		
		driver.close();
       
	}
}
