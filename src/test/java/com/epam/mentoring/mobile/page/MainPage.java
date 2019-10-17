package com.epam.mentoring.mobile.page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.PageFactory.initElements;

@Getter
public class MainPage {
    private AndroidDriver<AndroidElement> driver;

    @AndroidFindBy (id = "digit_1")
    private AndroidElement numberOne;
    @AndroidFindBy (id = "digit_2")
    private AndroidElement numberTwo;
    @AndroidFindBy (id = "digit_3")
    private WebElement numberThree;
    @AndroidFindBy (id = "digit_4")
    private WebElement numberFour;
    @AndroidFindBy (id = "digit_5")
    private WebElement numberFive;
    @AndroidFindBy (id = "digit_6")
    private WebElement numberSix;
    @AndroidFindBy (id = "digit_7")
    private WebElement numberSeven;
    @AndroidFindBy (id = "digit_8")
    private WebElement numberEight;
    @AndroidFindBy (id = "digit_9")
    private WebElement numberNine;
    @AndroidFindBy (id = "op_add")
    private WebElement plus;
    @AndroidFindBy (id = "eq")
    private WebElement equally;
    @AndroidFindBy (id = "result")
    private WebElement result;

    public MainPage (AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        initElements(new AppiumFieldDecorator(driver), this);
    }

    public MainPage clickOne () {
        numberOne.click();
        return this;
    }

    public MainPage clickTwo () {
        numberTwo.click();
        return this;
    }

    public MainPage clickThree () {
        numberThree.click();
        return this;
    }

    public MainPage clickFour () {
        numberFour.click();
        return this;
    }

    public MainPage clickFive () {
        numberFive.click();
        return this;
    }

    public MainPage clickSix () {
        numberSix.click();
        return this;
    }

    public MainPage clickSeven () {
        numberSeven.click();
        return this;
    }

    public MainPage clickEight () {
        numberEight.click();
        return this;
    }

    public MainPage clickNine () {
        numberNine.click();
        return this;
    }

    public MainPage clickPlus () {
        plus.click();
        return this;
    }

    public MainPage clickEqually () {
        equally.click();
        return this;
    }

    public int getIntResult () {
        return Integer.parseInt(result.getText().replace(",", ""));
    }
}
