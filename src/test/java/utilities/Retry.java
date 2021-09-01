package utilities;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class Retry implements IRetryAnalyzer {
	
 
  private int retryCount = 0;
  private static final int maxRetryCount = 3;
 
  
  public boolean retry(ITestResult result) {
    if (retryCount < maxRetryCount) {
      retryCount++;
      return true;
    }
    return false;
  }
}


//Note: have to bind this retry class with others which you want to retry.
// Get the binding code from here : https://testng.org/doc/documentation-main.html#testng-listeners

//import org.testng.Assert;
//import org.testng.annotations.Test;
// 
//public class TestclassSample {
// 
//  @Test(retryAnalyzer = MyRetry.class)
//  public void test2() {
//    Assert.fail();
//  }
//}
