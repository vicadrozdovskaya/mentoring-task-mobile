package com.epam.mentoring.mobile.test;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest extends DriverSetup {

    @BeforeClass
    public void setUp () throws Exception {
        prepareNative();
    }

    @Test
    public void SimpleTest () {
        driver.findElement(By.id("by.onliner.catalog:id/nextContainer")).click();
        driver.findElement(By.id("by.onliner.catalog:id/nextView")).click();
        driver.findElement(By.id("by.onliner.catalog:id/nextView")).click();
        driver.findElement(By.id("by.onliner.catalog:id/nextView")).click();
        driver.findElement(By.id("by.onliner.catalog:id/nextView")).click();
        By electronicBtn = By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout");
        driver.findElement(electronicBtn).click();
        System.out.println("Simple Appium test have done");
    }

    @Test
    public void OpenSiteTest () {
        driver.get("http://iana.org");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown () {
        driver.quit();
    }

}
