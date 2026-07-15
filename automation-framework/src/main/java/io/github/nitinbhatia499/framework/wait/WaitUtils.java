package io.github.nitinbhatia499.framework.wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
    public static WebDriverWait getWait(WebDriver driver, Duration seconds) {
        return new WebDriverWait(driver, seconds);
    }
}
