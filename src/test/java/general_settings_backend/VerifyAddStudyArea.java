package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyAddStudyArea {
	@Test
	public void AddStudyAreaTest() throws InterruptedException {
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
		
		
		//Navigate to Study Area
		WebElement StudyArea = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[10]/a/span"));
		StudyArea.click();
		Thread.sleep(1000);
		
		//Add Study Area
		WebElement clickAdd = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		clickAdd.click();
		Thread.sleep(1000);
		
		//Choose File
		WebElement chooseFile = driver.findElement(By.id("country_img"));
		chooseFile.sendKeys("C:\\upload\\bike.jpg");
		Thread.sleep(1000);
		
		//En
		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		en.click();
		Thread.sleep(1000);
		
		//Exam Title
		WebElement examTitle = driver.findElement(By.xpath("//*[@id=\"en_title\"]"));
		examTitle.click();
		Thread.sleep(1000);
		examTitle.sendKeys("Mock");
		Thread.sleep(1000);
		
		//Scroll Down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(1000);
		
		driver.findElementByXPath("//*[@id=\"tinymce\"]/p").sendKeys("Automation");
		Thread.sleep(1000);
		
//		//Select Exam Type
//		WebElement examType = driver.findElement(By.xpath("//*[@id=\"type\"]"));
//		examType.click();
//		Thread.sleep(1000);
//		driver.findElementByXPath("//*[@id=\"type\"]/option[1]").click();
//		Thread.sleep(1000);
//		
//		//Select Parent Exam
//		WebElement parentExam = driver.findElement(By.xpath("//*[@id=\"parent_id\"]"));
//		parentExam.click();
//		Thread.sleep(1000);
//		driver.findElementByXPath("//*[@id=\"parent_id\"]/option[3]").click();
//		Thread.sleep(1000);
//		
//		//Select Minimum Score
//		WebElement minScore = driver.findElement(By.xpath("//*[@id=\"title\"]"));
//		minScore.click();
//		Thread.sleep(1000);
//		minScore.sendKeys("6.5");
//		Thread.sleep(1000);
//		
//		//Select Maximum Score
//		WebElement maxScore = driver.findElement(By.xpath("//*[@id=\"title\"]"));
//		maxScore.click();
//		Thread.sleep(1000);
//		maxScore.sendKeys("9");
//		Thread.sleep(1000);
//		
//		//En
//		WebElement en = driver.findElement(By.xpath("//*[@id=\"en\"]"));
//		en.click();
//		Thread.sleep(1000);
//		
//		//Exam Title
//		WebElement examTitle = driver.findElement(By.xpath("//*[@id=\"title\"]"));
//		examTitle.click();
//		Thread.sleep(1000);
//		examTitle.sendKeys("Mock");
//		Thread.sleep(1000);
		
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"study-area-form\"]/div[2]/div/div[6]/button"));
		submit.click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
