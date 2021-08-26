package title_backend;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;
;

public class VerifyTitle {
	@Test
	public void TitleTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://celtabroad.com/admin/");
		driver.manage().window().maximize();
		
		// verifying the page title
				String PageTitle = "Celt Abroad";
			
				if (driver.getTitle().equalsIgnoreCase(PageTitle)) {
					
					System.out.println("Yeah... Page title matched");
					
				}
					else {
						//Assert.fail("Write your custom error message");
						System.out.println("Page title did not match");
						throw new SkipException("Do not execute further steps");
					}
				
				driver.close();
				}
				
				
	}

