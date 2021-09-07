package security_test;
import org.testng.annotations.Test;
import base_class.DriverSetup;

public class VerifyHTTPorHTTPS extends DriverSetup{
	@Test
	public void SecurityTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/login");
		driver.manage().window().maximize();
		
		String myUrl = driver.getCurrentUrl();
		
		if (myUrl.contains("https"))
		{
			System.out.println("Site is Secured");
		}
		else
		{
			System.out.println("Site is not secured");
		}
		Thread.sleep(2000);
		driver.close();
	}

}
