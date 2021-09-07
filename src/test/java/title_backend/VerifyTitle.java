package title_backend;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_class.DriverSetup;
;

public class VerifyTitle extends DriverSetup {
	@Test
	public void TitleTest() throws InterruptedException {
		driver.get("https://celtabroad.com/admin/");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		String pageTitleActual = driver.getTitle();
		System.out.println("The page title is:" +pageTitleActual);
		Thread.sleep(3000);
		
		String pageTitleExpected = "Celt Abroad";
		Assert.assertEquals(pageTitleExpected, pageTitleActual);
				
				
	}
}
