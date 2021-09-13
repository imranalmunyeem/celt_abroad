package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.excel.utility.Xls_Reader;

import base_class.DriverSetup;


public class DataDrivenTest extends DriverSetup {
	
	@Test
	public void DataDrivenFromExcel() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mediusware\\Desktop\\Automation\\Selenium Webdriver Using Java\\Data Driven\\credentials.xlxs");
		
		String email = reader.getCellData("adminlogindata", "email", 2);
		System.out.println(email);
		
		String password = reader.getCellData("adminlogindata", "password", 2);
		System.out.println(password);
		
}
	

}
