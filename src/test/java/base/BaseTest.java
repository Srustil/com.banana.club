package base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.ConfigReader;
import utils.DriverUtils;

public class BaseTest {
    protected WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setup(@Optional("chrome") String browser) {
        driver = DriverUtils.initDriver(browser); // ✅ make sure driver is assigned
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigReader.getImplicitWait()));
    }

    @AfterClass
    public void tearDown() {
        DriverUtils.quitDriver();
    }
}
