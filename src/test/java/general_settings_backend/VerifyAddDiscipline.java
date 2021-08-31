package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class VerifyAddDiscipline {
	@Test
	public void AddDisciplineTest() throws InterruptedException {
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
		
		//Navigate to Discipline
		WebElement discipline = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[4]/a/span"));
		discipline.click();
		Thread.sleep(1000);
				
		
		//Add Discipline
		WebElement addDiscipline = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		addDiscipline.click();
		Thread.sleep(1000);
		
		//Cover
		WebElement chooseFileCover = driver.findElement(By.id("discipline_img"));
		chooseFileCover.sendKeys("C:\\Users\\Mediusware\\eclipse-workspace\\Celt_Abroad\\images\\1.jpg");
		Thread.sleep(1000);
		
		
		//Thumbnail
		WebElement chooseFileThumbnails = driver.findElement(By.xpath("//*[@id=\"discipline-form\"]/div[2]/input"));
		chooseFileThumbnails.sendKeys("C:\\Users\\Mediusware\\eclipse-workspace\\Celt_Abroad\\images\\2.jpg");
		Thread.sleep(1000);
		
		//Logo
		WebElement chooseFileLogo = driver.findElement(By.xpath("//*[@id=\"discipline-form\"]/div[3]/input"));
		chooseFileLogo.sendKeys("C:\\Users\\Mediusware\\eclipse-workspace\\Celt_Abroad\\images\\3.jpg");
		Thread.sleep(1000);
		
		//En
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(1000);
		
		//Description Title
		WebElement descriptionTitle = driver.findElement(By.xpath("//*[@id=\"en_title\"]"));
		descriptionTitle.sendKeys("UK");
		Thread.sleep(1000);
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(1000);
		
//		//Description 
//		WebElement description = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
//		description.click();
//		description.sendKeys("Automated Script");
//		Thread.sleep(1000);
		

		
		//En
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"discipline-form\"]/div[4]/div/div[6]/button"));
		submit.click();
		Thread.sleep(1000);
	}
}
