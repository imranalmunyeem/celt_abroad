package listeners;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
//import org.testng.annotations.Test;

//have to call listener in XML
//<listeners>
//<listener class-name="common.Listeners"/>
//</listeners>

public class listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is : "+result.getName());
		System.out.println("Test is Starting");
	}
	
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of Execution is : "+result.getStatus());
	}
	
	
	public void onTestFailure(ITestResult result) {
	}
	
	
	public void onTestSkipped(ITestResult result) {
	}
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}
	
	
	public void onStart(ITestContext contex) {
	}
	
}

