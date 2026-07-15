package io.github.nitinbhatia.framework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    public static WebDriver createChrome() {
        return new ChromeDriver();
    }
}

