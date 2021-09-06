package title_backend;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base_class.DriverSetup;
;

public class VerifyTitle extends DriverSetup {
	@Test
	public void TitleTest() {
//		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://celtabroad.com/admin/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
//		 verifying the page title
//				String PageTitle = "Celt Abroad";
//			
//				if (driver.getTitle().equalsIgnoreCase(PageTitle)) {
//					
//					System.out.println("Yeah... Page title matched");
//					
//				}
//					else {
//						//Assert.fail("Write your custom error message");
//						System.out.println("Page title did not match");
//						throw new SkipException("Do not execute further steps");
//					}
//				
//				driver.close();
//				}
		String pageTitleActual = driver.getTitle();
		System.out.println("The page title is:" +pageTitleActual);
		Thread.sleep(3000);
				
				
	}

