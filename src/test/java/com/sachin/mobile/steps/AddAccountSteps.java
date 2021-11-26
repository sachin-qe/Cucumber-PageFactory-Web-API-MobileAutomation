package com.sachin.mobile.steps;

import com.sachin.mobile.CommonLibrary;
import com.sachin.mobile.base.BaseClass;
import com.sachin.mobile.pages.DashboardScreen;
import com.sachin.mobile.pages.NewAccountScreen;
import com.sachin.mobile.pages.SettingsScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddAccountSteps extends BaseClass {
    static AppiumDriver<MobileElement> driver;
    DashboardScreen dashboardScreen;
    SettingsScreen settingScreen;
    NewAccountScreen newAccountScreen;
    WebDriverWait wait;
    CommonLibrary library = new CommonLibrary();
    static int count1, count2 = 0;

    @Given("Dashboard screen is open")
    public void dashboardScreenIsOpen() {
        driver = BaseClass.setup();
        newAccountScreen = new NewAccountScreen(driver);
        dashboardScreen = new DashboardScreen(driver);
        settingScreen = new SettingsScreen(driver);
        wait = new WebDriverWait(driver, 10L);
    }

    @When("user clicks on Settings button")
    public void userClicksOnSettingsButton() {
//        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        wait.until(ExpectedConditions.visibilityOf(dashboardScreen.getBalanceAmount()));
        library.waitForElementDisplay(driver, dashboardScreen.getBalanceAmount());
        dashboardScreen.getSettingIcon().click();
    }

    @And("user clicks on Accounts option")
    public void userClicksOnAccountsOption() {
//        this.driver.findElement(
        library.waitForElementDisplay(driver, settingScreen.getAccountButton());
        settingScreen.getAccountButton().click();
        System.out.println("count1" + settingScreen.getAccountCount().getSize());
    }

    @And("user clicks on Add account")
    public void userClicksOnAddAccount() {
        library.waitForElementDisplay(driver, settingScreen.getAccountAdd());
        settingScreen.getAccountAdd().click();
    }

    @And("user types in account fields")
    public void userTypesInAccountFields() {
        library.waitForElementDisplay(driver, newAccountScreen.getAccountCategoryName());
        newAccountScreen.getAccountCategoryName().sendKeys("NewAccount");
        newAccountScreen.getInitialAmount().sendKeys("150");
        newAccountScreen.getAccountType().click();
        newAccountScreen.getSaveAccountButton().click();

//        this.driver.findElement(this.newScreen.getSaveAccountButton()).click();
//        this.driver.findElement(this.newScreen.getInitialAmount()).sendKeys("150");
//        this.driver.findElement(this.newScreen.getAccountType()).click();
//        this.driver.findElement(this.newScreen.getSaveAccountButton()).click();
    }

    @Then("a new account type should get created")
    public void aNewAccountTypeShouldGetCreated() {
//        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        wait.until(ExpectedConditions.visibilityOf(newAccountScreen.getSnackBarText()));
        library.waitForElementDisplay(driver, newAccountScreen.getSnackBarText());
        Assert.assertTrue(newAccountScreen.getSnackBarText().isDisplayed());

//        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        wait.until(visibilityOfElementLocated(this.newScreen.getSnackBarText()));
//        Assert.assertTrue(this.driver.findElement(this.newScreen.getSnackBarText()).isDisplayed());

    }

    @And("the created account type should get listed")
    public void theCreatedAccountTypeShouldGetListed() {
        dashboardScreen.getSettingIcon().click();
        library.waitForElementDisplay(driver, settingScreen.getAccountButton());
        settingScreen.getAccountButton().click();
//        WebDriverWait wait = new WebDriverWait(driver, 10L);
        library.waitForElementDisplay(driver, newAccountScreen.getSnackBarText());
//        wait.until(ExpectedConditions.visibilityOf(newAccountScreen.getSnackBarText()));
        System.out.println("count2" +settingScreen.getAccountCount().getSize());
//        System.out.println("Count after is: " +count2);

        //        obj.getSettingIcon().click();
//        this.driver.findElement(this.screen.getAccountButton()).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10L);
//        wait.until(visibilityOfElementLocated(this.screen.getAccountCount())).getSize();
//        count2 = driver.findElements(this.screen.getAccountCount()).size();
//        System.out.println("Count after is: " + count2);
    }
}
