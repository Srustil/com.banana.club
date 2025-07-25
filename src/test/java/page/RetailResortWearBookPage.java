package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ActionsUtil;
import utils.DriverUtils;

public class RetailResortWearBookPage {
    private WebDriver driver;
    private ActionsUtil actionsUtil;
    private WebDriverWait wait;

    private By buttonLocator = By.xpath("//*[@id=\"shopify-section-sections--17783845781597__header\"]/store-header/div[2]/div/nav/div/button");

    public RetailResortWearBookPage(WebDriver driver) {
        this.driver = driver;
        this.actionsUtil = new ActionsUtil(driver); // ✅ pass driver explicitly
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void mhover() {
        WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(buttonLocator));
        wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));

        actionsUtil.moveToElementAndClick(button);
    }


    //branch1

}
