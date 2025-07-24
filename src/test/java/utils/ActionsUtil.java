package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {
    private Actions actions;

    public ActionsUtil(WebDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver must not be null");
        }
        this.actions = new Actions(driver);
    }

    public void hoverOverElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void rightClick(WebElement element) {
        actions.contextClick(element).perform();
    }

    public void doubleClick(WebElement element) {
        actions.doubleClick(element).perform();
    }

    public void dragAndDrop(WebElement source, WebElement target) {
        actions.dragAndDrop(source, target).perform();
    }

    public void clickAndHold(WebElement element) {
        actions.clickAndHold(element).perform();
    }

    public void release(WebElement element) {
        actions.release(element).perform();
    }

    public void sendKeys(WebElement element, CharSequence keys) {
        actions.sendKeys(element, keys).perform();
    }

    public void sendKeys(CharSequence keys) {
        actions.sendKeys(keys).perform();
    }

    public void moveToElementAndClick(WebElement element) {
        actions.moveToElement(element).click().perform();
    }
}