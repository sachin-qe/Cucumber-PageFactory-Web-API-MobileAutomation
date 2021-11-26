package com.sachin.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonLibrary {

    public  CommonLibrary(){}

    public void waitForElementDisplay(AppiumDriver<MobileElement> driver, MobileElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        Wait wait = new FluentWait(driver)
//                .withTimeout(10, TimeUnit.SECONDS)
//                .pollingEvery(250, TimeUnit.MILLISECONDS)
//                .ignoring(NoSuchElementException.class)
//                .ignoring(TimeoutException.class);
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By MobileElement (element));
//
//
//        WebDriverWait wait = new AppiumFluentWait<MobileElement>(element, Clock.tickSeconds(10L));
//        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.MILLISECONDS);
//        wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed();

    }

    public void elementDisplayCheck(MobileElement element) {
        Assert.assertTrue((element.isDisplayed()));
    }

    public void clickAndWait(AppiumDriver <MobileElement> appiumDriver, MobileElement element1, MobileElement element2){
        WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
        wait.until(ExpectedConditions.visibilityOf(element1)).isDisplayed();
        element2.click();
    }

    public void waitAndClick(AppiumDriver <MobileElement> appiumDriver, MobileElement element1, MobileElement element2){
        WebDriverWait wait = new WebDriverWait(appiumDriver, 10);
        element1.click();
        wait.until(ExpectedConditions.visibilityOf(element2)).isDisplayed();
    }
}
