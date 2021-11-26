package com.sachin.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsScreen {
    AppiumDriver<MobileElement> driver;

    public SettingsScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.monefy.app.lite:id/accounts_button")
    MobileElement accountButton;

    @FindBy(xpath = "//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    MobileElement accountCount;

    @FindBy(xpath = "//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.LinearLayout[1]/android.widget.TextView")
    MobileElement accountAdd;

    public void SettingScreen(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MobileElement getAccountButton() {
        return accountButton;
    }

    public MobileElement getAccountCount() {
        return accountCount;
    }

    public MobileElement getAccountAdd() {
        return accountAdd;
    }

    //    By accountButton = By.id("com.monefy.app.lite:id/accounts_button");
//    By accountCount = By.xpath("//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.TextView");
//    By accountAdd = By.xpath("//android.widget.ListView[@content-desc=\"List of accounts\"]/android.widget.LinearLayout[1]/android.widget.TextView");
//
//    public By getAccountButton() {
//        return accountButton;
//    }
//
//    public By getAccountCount() {
//        return accountCount;
//    }
//
//    public By getAccountAdd() {
//        return accountAdd;
//    }
}
