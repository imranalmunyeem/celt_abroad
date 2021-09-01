package utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.sun.jna.platform.FileUtils;
public class Screenshots {
	@Test
	public void ScreenshotFailedCases() throws InterruptedException {
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
	
//		
//		 @AfterMethod 
//		 //AfterMethod annotation - This method executes after every test execution
//		 public void screenShot(ITestResult result){
//		 //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
//		 if(ITestResult.FAILURE==result.getStatus()){
//		 try{
//		 // To create reference of TakesScreenshot
//		 TakesScreenshot screenshot=(TakesScreenshot)driver;
//		 // Call method to capture screenshot
//		 File src=screenshot.getScreenshotAs(OutputType.FILE);
//		 // Copy files to specific location 
//		 // result.getName() will return name of test case so that screenshot name will be same as test case name
//		 FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
//		 System.out.println("Successfully captured a screenshot");
//		 }catch (Exception e){
//		 System.out.println("Exception while taking screenshot "+e.getMessage());
//		 } 
//		 }
//		 driver.quit();
	}

}
