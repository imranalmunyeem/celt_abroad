package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyActionsStudent {
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
		
		//Delete
		WebElement deleteStudent = driver.findElement(By.xpath("//*[@id=\"student_delete\"]/i"));
		deleteStudent.click();
		Thread.sleep(1000);
		
		WebElement deleteCancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		deleteCancel.click();
		Thread.sleep(1000);
		
		WebElement cancelOk = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelOk.click();
		Thread.sleep(1000);
		
		deleteStudent.click();
		Thread.sleep(1000);
		
		WebElement deleteYes = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[2]"));
		deleteYes.click();
		Thread.sleep(1000);
		
		//Graduated
		WebElement graduated = driver.findElement(By.xpath("//*[@id=\"student-table\"]/tbody/tr[1]/td[8]/a/i"));
		graduated.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.close();
	}
}
