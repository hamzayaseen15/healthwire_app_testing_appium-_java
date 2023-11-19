package org.example;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    private static final ThreadLocal<AppiumDriver> driverThreadLocal = new ThreadLocal<>();

    public static AppiumDriver getDriver() {
        return driverThreadLocal.get();
    }

    public static void setDriver(AppiumDriver driver) {
        driverThreadLocal.set(driver);
    }

    public static void unsetDriver() {
        driverThreadLocal.remove();
    }
}