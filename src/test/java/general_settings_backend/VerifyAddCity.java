package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyAddCity {
	@Test
	public void AddTest() throws InterruptedException {
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
		
		//Navigate to General Settings
		WebElement generalSettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/a/span[1]"));
		generalSettings.click();
		Thread.sleep(1000);
		
		//Navigate to City
		WebElement city = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[7]/a/span"));
		city.click();
		Thread.sleep(1000);
		
	    //Add City
	    WebElement addCity = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
	    addCity.click();
	    Thread.sleep(1000);
		
	    //Choose City Image
		WebElement cityImage = driver.findElement(By.xpath("//*[@id=\"city_img\"]"));
		cityImage.sendKeys("C:\\Users\\Mediusware\\eclipse-workspace\\Celt_Abroad\\images\\2.jpg");
		Thread.sleep(1000);
		
		//Choose Country
		WebElement chooseCountry = driver.findElement(By.xpath("//*[@id=\"country_id\"]"));
		chooseCountry.click();
		chooseCountry.sendKeys("//*[@id=\"country_id\"]/option[1]");
		Thread.sleep(1000);
		
		//Choose State
		WebElement chooseState = driver.findElement(By.xpath("//*[@id=\"state_id\"]"));
		chooseState.click();
		chooseState.sendKeys("//*[@id=\"state_id\"]/option[3]");
		Thread.sleep(1000);
		
		//Select En
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(1000);
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(1000);
		
		//City Title
		WebElement cityTitle = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		cityTitle.click();
		Thread.sleep(1000);
		cityTitle.sendKeys("Austria");
		Thread.sleep(1000);
		
		//City Description
		WebElement cityDescription = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
		cityDescription.click();
		cityDescription.sendKeys("Hello there");
		
		//Submit
		WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"city_form\"]/div[4]/div/div[6]/button"));
		submitButton.click();
		Thread.sleep(1000);
		
		
		
		
		driver.close();
		
	}
}
