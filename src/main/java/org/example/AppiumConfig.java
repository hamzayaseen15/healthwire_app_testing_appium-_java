package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumConfig {
    public static AppiumDriver driver;

    public static void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Z5R4J7IBQKPZL7X4");
        caps.setCapability("platformName", "android");
        caps.setCapability("appPackage", "com.healthwire.healthwire");
        caps.setCapability("appActivity", "com.healthwire.healthwire.ui.activities.SplashActivity");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("noReset", true);
        caps.setCapability("autoAcceptAlerts", false);
        caps.setCapability("newCommandTimeout", "5000");

        URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(appiumServerURL, caps);
        DriverManager.setDriver(driver);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            DriverManager.unsetDriver();
        }
    }
}
