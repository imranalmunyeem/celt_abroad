package university_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyActionsProgram {
	@Test
	public void ActionsTest() throws InterruptedException {
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
		
		
		//Delete
		WebElement deleteProgram = driver.findElement(By.xpath("//*[@id=\"institution_delete\"]/i"));
		deleteProgram.click();
		Thread.sleep(1000);
		
		WebElement deleteCancel = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		deleteCancel.click();
		Thread.sleep(1000);
		
		WebElement cancelOk = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/button[1]"));
		cancelOk.click();
		Thread.sleep(1000);
		
		//View
		WebElement viewInstitutions = driver.findElement(By.xpath("//*[@id=\"institutionprogram-table\"]/tbody/tr[1]/td[7]/a[2]"));
		viewInstitutions.click();
		Thread.sleep(1000);
				
		driver.navigate().back();  	
				
		//Edit
		WebElement editProgram = driver.findElement(By.xpath("//*[@id=\"institutionprogram-table\"]/tbody/tr[1]/td[7]/a[1]"));
		editProgram.click();
		Thread.sleep(1000);
		
		//Edit Country Initial
		WebElement editInitial = driver.findElement(By.xpath("//*[@id=\"en\"]"));
		editInitial.click();
		Thread.sleep(1000);
		
		//Edit Country Title
		WebElement editTitle = driver.findElement(By.xpath("//*[@id=\"title\"]"));
		editTitle.click();
		Thread.sleep(1000);
		editTitle.clear();
		Thread.sleep(1000);
		editTitle.sendKeys("Cyber Security");
		Thread.sleep(1000);
				
		//Edit Country Description
		WebElement editDescription = driver.findElement(By.xpath("//*[@id=\"en_form\"]/div[2]/textarea"));
		editDescription.click();
		Thread.sleep(1000);
		editDescription.clear();
		Thread.sleep(1000);
		editDescription.sendKeys("This is an Automated Test Script");
		Thread.sleep(1000);		
				
		//Edit Subject Ranking
		WebElement editSranking = driver.findElement(By.xpath("//*[@id=\"subject_ranking\"]"));
		editSranking.click();
		Thread.sleep(1000);
		editSranking.clear();
		Thread.sleep(1000);
		editSranking.sendKeys("2");
		Thread.sleep(1000);
		
		//Edit QS Ranking
		WebElement editQSranking = driver.findElement(By.xpath("//*[@id=\"qs_ranking\"]"));
		editQSranking.click();
		Thread.sleep(1000);
		editQSranking.clear();
		Thread.sleep(1000);
		editQSranking.sendKeys("2");
		Thread.sleep(1000);
		
		//Edit Faculty
		WebElement editFaculty = driver.findElement(By.xpath("//*[@id=\"ins_faculty\"]"));
		editFaculty.click();
		Thread.sleep(1000);
		editFaculty.clear();
		Thread.sleep(1000);
		editFaculty.sendKeys("12");
		Thread.sleep(1000);
		
		//Edit Institutions
		WebElement editInstitution = driver.findElement(By.xpath("//*[@id=\"program-form\"]/div/div[1]/div/div/div[3]/select"));
		editInstitution.click();
		Thread.sleep(1000);
				
		WebElement editNameInstitution = driver.findElement(By.xpath("//*[@id=\"program-form\"]/div/div[1]/div/div/div[3]/select/option[9]"));
		editNameInstitution.click();
		Thread.sleep(1000);
		
		//Edit Country
		WebElement editCountry = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		editCountry.click();
		Thread.sleep(1000);
						
		WebElement editNameCountry = driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]"));
		editNameCountry.click();
		Thread.sleep(1000);
				
		
		//Submit
		WebElement submitProgram = driver.findElement(By.xpath("//*[@id=\"program-form\"]/div/div[2]/div/div/div[9]/button"));
		submitProgram.click();
		Thread.sleep(1000);
				
		driver.close();
		
		
	}
}
