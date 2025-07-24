package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Step;
import page.RetailResortWearBookPage;
import page.RetailStorePage;
import utils.ActionsUtil;
import utils.ConfigReader;
import utils.DriverUtils;

public class RetailResortWearBookTest extends BaseTest
{
	private String url;
	
    @Test
    @Step("Open retail store page")
    public void verifyRetailResortWearBook()
    {
        
		driver.get(ConfigReader.get("url"));
		RetailResortWearBookPage page = new RetailResortWearBookPage(driver);
		page.mhover();
		
		 
		 
    }

}
