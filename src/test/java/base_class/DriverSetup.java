package base_class;
//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
///import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver;
		@BeforeSuite
		public static void setDriver() {
			System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		@AfterSuite
		public static void close() {
			driver.close();
		}
}
