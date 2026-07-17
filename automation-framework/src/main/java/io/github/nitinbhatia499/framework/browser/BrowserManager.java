package io.github.nitinbhatia499.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManager {
    private static WebDriver driver;
    public static WebDriver createChrome()
    {
        driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver createFirefox() {
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver createEdge() {
        driver = new EdgeDriver();
        return driver;
    }

    public static WebDriver launchBrowser(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return createChrome();
            case "firefox":
                return createFirefox();
            case "edge":
                return createEdge();
            default:
                throw new IllegalArgumentException("Unsupported browser: " + browserType);
        }
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}



