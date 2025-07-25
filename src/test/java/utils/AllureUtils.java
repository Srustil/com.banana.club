package utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class AllureUtils 
{

    /**
     * Attach a screenshot to the Allure report.
     * @param driver WebDriver instance
     * @param name Name of the screenshot attachment
     */
    public static void attachScreenshot(WebDriver driver, String name) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment(name, new ByteArrayInputStream(screenshot));
        } catch (Exception e) {
            attachText("Screenshot Error", "Failed to capture screenshot: " + e.getMessage());
        }
    }

    public static void attachText(String name, String content) {
        Allure.addAttachment(name, "text/plain", new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8)), ".txt");
    }

    public static void attachHtml(String name, String html) {
        Allure.addAttachment(name, "text/html", new ByteArrayInputStream(html.getBytes(StandardCharsets.UTF_8)), ".html");
    }
}





