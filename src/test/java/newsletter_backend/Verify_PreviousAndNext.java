package newsletter_backend;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_PreviousAndNext {
	@Test
	public void previous_next_test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
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
		
		//newsletter
		WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[8]/a/span"));
		newsletter.click();
		Thread.sleep(2000);
		
		
        
		//Previous and Next 
		WebElement next = driver.findElement(By.xpath("//*[@id=\"newsletterdatatable-table_next\"]/a"));
		next.click();
//		// Scrolling down the page till the element is found		
//				js.executeScript("arguments[0].scrollIntoView();",next);
		Thread.sleep(2000);
		
		WebElement previous = driver.findElement(By.xpath("//*[@id=\"newsletterdatatable-table_previous\"]"));
		previous.click();
		Thread.sleep(2000);
		
		next.click();
		Thread.sleep(2000);
		
		previous.click();
		Thread.sleep(2000);
		
		
		
	}
}
