package com.sachin.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardScreen {
    AppiumDriver<MobileElement> driver;

    public DashboardScreen(AppiumDriver<MobileElement> appiumDriver) {
        this.driver = appiumDriver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @FindBy(id = "com.monefy.app.lite:id/toolbar")
    MobileElement dashboardId;

    @FindBy(id = "com.monefy.app.lite:id/overflow")
    MobileElement settingIcon;

    @FindBy(id = "com.monefy.app.lite:id/action_bar_root")
    MobileElement actionBar;

    @FindBy(id = "com.monefy.app.lite:id/piegraph")
    MobileElement pieGraph;

    @FindBy(id = "com.monefy.app.lite:id/expense_button")
    MobileElement expenseButton;

    @FindBy(id = "com.monefy.app.lite:id/income_button")
    MobileElement incomeButton;

    @FindBy(id = "com.monefy.app.lite:id/SliderDragView")
    MobileElement sliderDragView;

    @FindBy(id = "com.monefy.app.lite:id/pts_main")
    MobileElement transferTip;

    @FindBy(id = "com.monefy.app.lite:id/messageTextView")
    MobileElement msgTxtView;

    @FindBy(id = "com.monefy.app.lite:id/balance_amount")
    MobileElement balanceAmount;

    public MobileElement getDashboardId() {
        return dashboardId;
    }

    public MobileElement getSettingIcon() {
        return settingIcon;
    }

    public MobileElement getActionBar() {
        return actionBar;
    }

    public MobileElement getExpenseButton() {
        return expenseButton;
    }

    public MobileElement getIncomeButton() {
        return incomeButton;
    }

    public MobileElement getTransferTip() {
        return transferTip;
    }

    public MobileElement getMsgTxtView() {
        return msgTxtView;
    }

    public MobileElement getBalanceAmount() {
        return balanceAmount;
    }

    public MobileElement getSliderDragView() {
        return sliderDragView;
    }

    public MobileElement getPiegraph() {
        return pieGraph;
    }
}

//public class DashboardScreen {
//    By dashboardId = By.id("com.monefy.app.lite:id/toolbar");
//    By actionBar = By.id("com.monefy.app.lite:id/action_bar_root");
//
//    By pieGraph = By.id("com.monefy.app.lite:id/piegraph");
//    By expenseButton = By.id("com.monefy.app.lite:id/expense_button");
//    By incomeButton = By.id("com.monefy.app.lite:id/income_button");
//    By sliderDragView = By.id("com.monefy.app.lite:id/SliderDragView");
//    By transferTip = By.id("com.monefy.app.lite:id/pts_main");
//    By msgTxtView = By.id("com.monefy.app.lite:id/messageTextView");
//    By balanceAmount = By.id("com.monefy.app.lite:id/balance_amount");
//    By settingIcon = By.id("com.monefy.app.lite:id/overflow");
//
//    public By getSettingIcon() {
//        return this.settingIcon;
//    }
//
//    public By getBalanceAmount() {
//        return this.balanceAmount;
//    }
//
//    public By getDashboardId() {
//        return this.dashboardId;
//    }
//
//    public By getactionBar(){
//        return this.actionBar;
//    }
//
//    public By getPieGraph() {
//        return this.pieGraph;
//    }
//
//    public By getExpenseButton() {
//        return this.expenseButton;
//    }
//
//    public By getIncomeButton() {
//        return this.incomeButton;
//    }
//
//    public By getsliderDragView() {
//        return this.incomeButton;
//    }
//
//    public static DashboardScreen getInstance() {
//        return new DashboardScreen();
//    }
//
//}
