package com.epam.mentoring.mobile.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverSetup {

    protected AndroidDriver driver;

    protected void prepareNative () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        File appDir = new File("C:\\mentoring\\mentoring-projects\\mentoring-task-mobile\\src\\main\\resources");
        File app = new File(appDir, "test.apk");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appActivity", "by.onliner.catalog.ui.screen.tutorial.TutorialActivity");
        capabilities.setCapability("appPackage", "by.onliner.catalog");
        capabilities.setCapability("appWaitDuration", "5000");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

    protected void prepareNativeCalculator () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appWaitDuration", "5000");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    protected void prepareWeb () throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("chromedriverExecutable", "C:\\webdrivers\\chromedriver\\chromedriver69formobile\\chromedriver.exe");
        capabilities.setCapability("appWaitDuration", "5000");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}
