package com.sachin.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccountScreen {
    AppiumDriver<MobileElement> driver;

    public NewAccountScreen(AppiumDriver<MobileElement> appiumDriver){
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.monefy.app.lite:id/editTextCategoryName")
    MobileElement accountCategoryName;

    @FindBy(id = "com.monefy.app.lite:id/initialAmount")
    MobileElement initialAmount;

    @FindBy(xpath = "//android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
    MobileElement accountType;

    @FindBy(id = "com.monefy.app.lite:id/save")
    MobileElement saveAccountButton;

    @FindBy(id = "com.monefy.app.lite:id/snackbar_text")
    MobileElement snackBarText;

    public MobileElement getAccountCategoryName() {
        return accountCategoryName;
    }

    public MobileElement getInitialAmount() {
        return initialAmount;
    }

    public MobileElement getAccountType() {
        return accountType;
    }

    public MobileElement getSaveAccountButton() {
        return saveAccountButton;
    }

    public MobileElement getSnackBarText() {
        return snackBarText;
    }

    //    By accountCategoryName = By.id("com.monefy.app.lite:id/editTextCategoryName");
//    By initialAmount = By.id("com.monefy.app.lite:id/initialAmount");
//    By accountType = By.xpath("//android.widget.GridView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.ImageView");
//    By saveAccountButton = By.id("com.monefy.app.lite:id/save");
//    By snackBarText = By.id("com.monefy.app.lite:id/snackbar_text");
//
//    public By getAccountCategoryName() {
//        return this.accountCategoryName;
//    }
//
//    public By getInitialAmount() {
//        return this.initialAmount;
//    }
//
//    public By getAccountType() {
//        return this.accountType;
//    }
//
//    public By getSaveAccountButton() {
//        return this.saveAccountButton;
//    }
//
//    public By getSnackBarText() {
//        return this.snackBarText;
//    }
}
