package user_authentication_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import base_class.DriverSetup;


public class VerifyCheckboxofLogin extends DriverSetup {

		@Test
		public void CheckboxTest() throws InterruptedException {
				
			driver.get("https://celtabroad.com/admin/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			 // Selecting CheckBox		
	        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[3]/div/div/label"));							
	        Thread.sleep(1000);
	        
	        // This will Toggle the Check box 		
	        checkbox.click();			
	        Thread.sleep(500);
	        checkbox.click();
	        Thread.sleep(500);
	        checkbox.click();			
	        Thread.sleep(500);
	        checkbox.click();
	        Thread.sleep(500);
	        
	        
	        // Check whether the Check box is toggled on 		
	        if (checkbox.isSelected()) {					
	            System.out.println("Checkbox is Toggled On");					

	        } else {			
	            System.out.println("Checkbox is Toggled Off");					
	        }	
	        
	        Thread.sleep(1000);
			
	        driver.close();
		}
}
