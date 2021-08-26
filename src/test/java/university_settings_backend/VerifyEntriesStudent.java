package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyEntriesStudent {
	@Test
	public void EntriesTest() throws InterruptedException {
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
		
		
		//Navigate to University Settings
		WebElement universitySettings = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/a/span[1]"));
		universitySettings.click();
		Thread.sleep(1000);
		
		//Navigate to Representative
		WebElement representative = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[1]/a/span"));
		representative.click();
		Thread.sleep(1000);
		
		//Navigate to Institutions
		WebElement institutions = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[2]/a/span"));
		institutions.click();
		Thread.sleep(1000);
		
		//Navigate to Programms
		WebElement program = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[3]/a/span"));
		program.click();
		Thread.sleep(1000);
		
		//Navigate to Student
		WebElement student = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[4]/ul/li[4]/a/span"));
		student.click();
		Thread.sleep(1000);
		
		//entries
		WebElement entries_student = driver.findElement(By.xpath("//*[@id=\"student-table_length\"]/label/select"));
		entries_student.click();
		Thread.sleep(2000);
		
		
		//Entry List
		
		//10
		driver.findElementByXPath("//*[@id=\"student-table_length\"]/label/select/option[1]").click();
		entries_student.click();
		Thread.sleep(1000);
		
		//25
		driver.findElementByXPath("//*[@id=\"student-table_length\"]/label/select/option[2]").click();
		entries_student.click();
		Thread.sleep(1000);
		
		//50
		driver.findElementByXPath("//*[@id=\"student-table_length\"]/label/select/option[3]").click();
		entries_student.click();
		Thread.sleep(1000);
		
		//100
		driver.findElementByXPath("//*[@id=\"student-table_length\"]/label/select/option[4]").click();
		entries_student.click();
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
