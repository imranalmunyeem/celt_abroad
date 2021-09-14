package datadriven;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base_class.DriverSetup;


public class LoginTest extends DriverSetup {
	
	@Test(dataProvider="LoginData")
	public void loginTest(String user,String pwd,String exp) throws InterruptedException
	{
		driver.get("https://celtabroad.com/admin/login");
		Thread.sleep(2000);
		
		WebElement txtEmail=driver.findElement(By.id("email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		
		WebElement txtPassword=driver.findElement(By.id("password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/div/div/div/form/div[4]/div/button")).click(); //Login  button
		
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException
	{
		
		//get the data from excel
		String path=".\\datafiles\\loginData.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1",1);	
				
		String loginData[][]=new String[totalrows][totalcols];
			
		
		for(int i=1;i<=totalrows;i++) //1
		{
			for(int j=0;j<totalcols;j++) //0
			{
				loginData[i-1][j]=xlutil.getCellData("Sheet1", i, j);
			}
				
		}
		
		return loginData;
	}
	
}