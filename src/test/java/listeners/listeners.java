package listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

//have to call listener in XML
//<listeners>
//<listener class-name="common.Listeners"/>
//</listeners>

public class listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	}
	
	
	public void onTestSuccess(ITestResult result) {
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

