package script;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.RetailStorePage;
import utils.ConfigReader;

@Listeners(listeners.TestListener.class)
public class RetailStoreTest extends BaseTest {


	@Epic("Retail Store")
	@Feature("RetailStorePageLoads")
	@Story("Page title")
	@Severity(SeverityLevel.NORMAL)
	@Step("Open retail store page and verify the page title")
	@Test
    public void verifyRetailStorePageLoads() {
        driver.get(ConfigReader.get("url")); // ✅ uses inherited driver

        RetailStorePage page = new RetailStorePage(driver); // ✅ pass driver explicitly
        String expectedTitle = "Banana Club";
        Assert.assertTrue(page.getPageTitle().contains(expectedTitle), "Title mismatch!");

        String expectedURL = "https://bananaclub.co.in/pages/retail-location";
        Assert.assertTrue(page.getPageURL().contains(expectedURL), "URL mismatch!");
    }

}
