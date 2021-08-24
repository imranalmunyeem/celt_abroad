package newsletter_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Search {
	@Test
	public void newsletter_search_test() throws InterruptedException {
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
		
		//newsletter
		WebElement newsletter = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[8]/a/span"));
		newsletter.click();
		Thread.sleep(2000);
		
		//Search
		WebElement search = driver.findElement(By.xpath("//*[@id=\"newsletterdatatable-table_filter\"]/label/input"));
		search.click();
		Thread.sleep(2000);
		search.sendKeys("test");
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
