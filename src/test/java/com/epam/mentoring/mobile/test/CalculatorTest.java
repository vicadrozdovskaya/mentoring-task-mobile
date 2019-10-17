package com.epam.mentoring.mobile.test;

import com.epam.mentoring.mobile.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest extends DriverSetup {

    @BeforeClass
    public void setUp () throws Exception {
        prepareNativeCalculator();
    }

    @Test
    public void AdditionTest () {
        int result = new MainPage(driver).clickOne()
                                   .clickTwo()
                                   .clickThree()
                                   .clickPlus()
                                   .clickNine()
                                   .clickEight()
                                   .clickSeven()
                                   .clickEqually()
                                   .getIntResult();
        Assert.assertEquals(1110, result, "check result of 123+987");
    }


    @AfterClass
    public void tearDown () {
        driver.quit();
    }

}
