package script;

import base.BaseTest;
import io.qameta.allure.Step;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.RetailStorePage;
import utils.ConfigReader;

public class RetailStoreTest extends BaseTest {


	@Test
    @Step("Open retail store page")
    public void verifyRetailStorePageLoads() {
        driver.get(ConfigReader.get("url")); // ✅ uses inherited driver

        RetailStorePage page = new RetailStorePage(driver); // ✅ pass driver explicitly
        String expectedTitle = "Banana Club";
        Assert.assertTrue(page.getPageTitle().contains(expectedTitle), "Title mismatch!");

        String expectedURL = "https://bananaclub.co.in/pages/retail-location";
        Assert.assertTrue(page.getPageURL().contains(expectedURL), "URL mismatch!");
    }

}
