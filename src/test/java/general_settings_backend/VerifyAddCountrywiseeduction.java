package general_settings_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base_class.DriverSetup;

public class VerifyAddCountrywiseeduction extends DriverSetup {
	@Test
	public void AddTestCountrywiseeducation() throws InterruptedException {

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
		
		//Navigate to Country Wise Education
		WebElement countryWiseEducation = driver.findElement(By.xpath("//*[@id=\"sidebar-menu\"]/ul/li[3]/ul/li[5]/a/span"));
		countryWiseEducation.click();
		Thread.sleep(1000);
		
		//Add Country Wise Education
		WebElement addCountryWiseEducation = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div/a"));
		addCountryWiseEducation.click();
		Thread.sleep(1000);
		
		//Add Residential Country
		WebElement addResidentialCountry = driver.findElement(By.xpath("//*[@id=\"residential_country_id\"]"));
		addResidentialCountry.click();
		driver.findElement(By.xpath("//*[@id=\\\"residential_country_id\\\"]/option[3]"));
		Thread.sleep(1000);
		
		//Add Destination Country
		WebElement addDestinationCountry = driver.findElement(By.xpath("//*[@id=\"destination_country_id\"]"));
		addDestinationCountry.click();
		driver.findElement(By.xpath("//*[@id=\\\"destination_country_id\\\"]/option[2]"));
		Thread.sleep(1000);
		
		//Add Degree Level
		WebElement addDegreeLevel = driver.findElement(By.xpath("//*[@id=\"residential_degree_id\"]"));
		addDegreeLevel.click();
		driver.findElement(By.xpath("//*[@id=\\\"residential_degree_id\\\"]/option[4]"));
		Thread.sleep(1000);
		
		//Add 2nd Degree Level
		WebElement addSecondDegreeLevel = driver.findElement(By.xpath("//*[@id=\"degrees\"]/option[4]"));
		addSecondDegreeLevel.click();
		Thread.sleep(1000);
		
		//Submit
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"exam_form\"]/div[5]/div/div/button"));
		submit.click();
		Thread.sleep(1000);	
		
		driver.close();
		
		
		
		
		
		
	}
}
