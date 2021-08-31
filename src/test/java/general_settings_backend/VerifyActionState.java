package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyActionState {
	@Test
	public void ActionTest() throws InterruptedException {
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
		
		//Navigate to Region/State
		WebElement state = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[6]/a/span"));
		state.click();
		Thread.sleep(1000);	
		
		//Delete
		WebElement delete = driver.findElement(By.xpath("//*[@id=\"state_delete\"]"));
		delete.click();
		Thread.sleep(1000);
		
		//Cancel Delete
		WebElement cancelDelete = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelDelete.click();
		Thread.sleep(1000);
		
		//Cancel ok
		WebElement cancelOK = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelOK.click();
		Thread.sleep(1000);
		
		//View
		WebElement viewState = driver.findElement(By.xpath("//*[@id=\"state_datatables\"]/tbody/tr[1]/td[6]/a[2]"));
		viewState.click();
		Thread.sleep(1000);
		
		driver.navigate().back();  
		Thread.sleep(1000);
		
		//Edit
		WebElement editState = driver.findElement(By.xpath("//*[@id=\"state_datatables\"]/tbody/tr[1]/td[6]/a[1]"));
		editState.click();
		Thread.sleep(1000);
		
		WebElement chooseFile = driver.findElement(By.id("state_img"));
		chooseFile.sendKeys("C:\\Users\\Mediusware\\eclipse-workspace\\Celt_Abroad\\images\\2.jpg");
		
		WebElement chooseCountry = driver.findElement(By.xpath("//*[@id=\"country_id\"]"));
		chooseCountry.sendKeys("//*[@id=\"country_id\"]/option[3]");
		
		//Select en
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(1000);
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(1000);
		
		//State Title
		WebElement stateTitle = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		stateTitle.click();
		stateTitle.clear();
		stateTitle.sendKeys("Sweden");
		Thread.sleep(1000);
		
		//Submit state
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"state_edit_form\"]/div[3]/div/div[6]/button"));
		submit.click();
		Thread.sleep(1000);
		driver.close();
		
	}
}
