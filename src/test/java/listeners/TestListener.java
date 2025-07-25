package listeners;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.AllureUtils;
import utils.DriverUtils;

public class TestListener implements ITestListener 
{

	private WebDriver driver;
	
	
    @Override
    public void onTestFailure(ITestResult result) {
         driver = DriverUtils.getDriver();
        String methodName = result.getMethod().getMethodName();
        AllureUtils.attachScreenshot(driver, "Failure - " + methodName);
        AllureUtils.attachText("Exception", result.getThrowable().getMessage());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Starting test: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getMethod().getMethodName());
    }

    // You can override other methods like onTestSkipped, onFinish, etc.
}