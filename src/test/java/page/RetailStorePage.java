package page;

import org.openqa.selenium.WebDriver;

import utils.DriverUtils;

public class RetailStorePage {
	 private WebDriver driver;

	    public RetailStorePage(WebDriver driver) {
	        // Get the shared driver from DriverUtils
	        this.driver = driver;
	    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageURL() {
        return driver.getCurrentUrl();
    }

    // Add more methods for verifying store locations, maps, etc., if needed
}
