package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import page.RetailResortWearBookPage;
import page.RetailStorePage;
import utils.ActionsUtil;
import utils.ConfigReader;
import utils.DriverUtils;
@Listeners(listeners.TestListener.class)
public class RetailResortWearBookTest extends BaseTest
{
	private String url;
	
	@Epic("Retail Store")
	@Feature("Resort Wear Book")
	@Story("Hover interaction")
	@Severity(SeverityLevel.CRITICAL)
	@Step("Open retail store page and hover over resort wear")
	@Test
    public void verifyRetailResortWearBook()
    {
        
		driver.get(ConfigReader.get("url"));
		RetailResortWearBookPage page = new RetailResortWearBookPage(driver);
		page.mhover();
		//Assert.assertTrue(false, "Forcing failure for screenshot demo on allure report");
		 
		 
    }

}
