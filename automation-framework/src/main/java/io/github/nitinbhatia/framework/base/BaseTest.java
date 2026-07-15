package io.github.nitinbhatia.framework.base;

import io.github.nitinbhatia.framework.Config.ConfigLoader;
import io.github.nitinbhatia.framework.driver.DriverFactory;
import io.github.nitinbhatia.framework.logger.LoggerUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String browser = ConfigLoader.get("browser");
        LoggerUtil.info("Starting test with browser: " + browser);
        driver = DriverFactory.getDriver(browser);
        driver.get(ConfigLoader.get("base.url"));
        LoggerUtil.info("Navigated to: " + ConfigLoader.get("base.url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            LoggerUtil.info("Browser closed.");
        }
    }
}