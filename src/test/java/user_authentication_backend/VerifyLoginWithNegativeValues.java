package user_authentication_backend;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base_class.DriverSetup;
import utilities.XLUtility;

public class VerifyLoginWithNegativeValues extends DriverSetup {
			
		@Test(dataProvider="LoginData")
		public void TestLoginWithNegativeValues(String email, String password, String result) throws InterruptedException {
//			System.out.println(email + password + result);
			driver.get("https://celtabroad.com/admin/login");
			
			//input email
			WebElement txtemail = driver.findElement(By.name("email"));
			txtemail.clear();
			txtemail.sendKeys("username");
			Thread.sleep(1000);
			
			
			//input password
			WebElement txtpassword = driver.findElement(By.name("password"));
			txtpassword.clear();
			txtpassword.sendKeys("password");
			Thread.sleep(1000);
			
			//Login Button
			WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button"));
			login.click();
			Thread.sleep(1000);
		}
		
		
		
		@DataProvider(name="LoginData")	
		public String [] [] getData(){
			
//			String loginData [] [] = {
//					{"!@#@gmail.com", "qwert", "Invalid"},
//					{"abc@gmail.com", "1234", "Invalid"},
//					{"1223.com", "asdf", "Invalid"},
//					{"admin@admin.com", "admin123", "Valid"}
						//};
			String path = ".\\datafiles\\loginData.xlxs";
			//XLUtils xlutils =new XLUtils(path);
			XLUtility xlutil =new XLUtility();
			
			int totalrows = xlutil.getRowCount("Sheet1", path);
			int totalcols = xlutil.getCellCount("Sheet1",path, 1);
			
			String loginData[][] = new String [totalrows] [totalcols];
			
			for (int i=1; i<=totalrows; i++) //1
			{
				for(int j=0; j<totalcols; j++) //0
				{
					loginData[i-1][j]=xlutil.getCellData("Sheet1",i, j);
					
				}
			}
			
		return loginData;
		}
}

