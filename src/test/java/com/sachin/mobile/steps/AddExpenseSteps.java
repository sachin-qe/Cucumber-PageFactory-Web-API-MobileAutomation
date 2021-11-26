package com.sachin.mobile.steps;

import com.sachin.mobile.CommonLibrary;
import com.sachin.mobile.base.BaseClass;
import com.sachin.mobile.pages.DashboardScreen;
import com.sachin.mobile.pages.ExpenseScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddExpenseSteps extends BaseClass {
    //    DashboardScreen obj = new DashboardScreen();
    static AppiumDriver<MobileElement> driver;
    DashboardScreen dashboardScreen;
    ExpenseScreen expenseScreen;
    WebDriverWait wait;
    CommonLibrary library = new CommonLibrary();

    @Given("user is at Dashboard screen")
    public void userIsAtDashboardScreen() {
        driver = BaseClass.setup();
        dashboardScreen = new DashboardScreen(driver);
        expenseScreen = new ExpenseScreen(driver);
        wait = new WebDriverWait(driver, 10L);

    }

    @When("user clicks on Expense button")
    public void userClicksOnExpenseButton() {
//        driver.findElement(DashboardScreen.getInstance().getExpenseButton()).click();
        dashboardScreen.getExpenseButton().click();
    }

    @And("user types in necessary fields")
    public void userTypesInNecessaryFields() {
//        wait.until(ExpectedConditions.visibilityOf(dashboardScreen.getBalanceAmount()));
        library.waitForElementDisplay(driver, expenseScreen.getAmountText());

        expenseScreen.getAmountText().click();
        expenseScreen.getButtonKey2().click();
        expenseScreen.getButtonKey1().click();
        expenseScreen.getButtonKey2().click();
        expenseScreen.getButtonKeyDecimal().click();
        expenseScreen.getButtonKey1().click();
        expenseScreen.getButtonKey2().click();
        expenseScreen.getNoteText().click();
        expenseScreen.getNoteText().sendKeys("Test");
        driver.hideKeyboard();

//        wait.until(ExpectedConditions.visibilityOf(expenseScreen.getChooseCategory()));
        library.waitForElementDisplay(driver, expenseScreen.getChooseCategory());
        expenseScreen.getChooseCategory().click();

//        wait.until(ExpectedConditions.visibilityOf(expenseScreen.getCategoryName()));
        library.waitForElementDisplay(driver, expenseScreen.getCategoryName());
        expenseScreen.getCategoryName().click();


//        WebDriverWait wait = new WebDriverWait(this.driver, 10L);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(exp.getamountText()));
//
//        this.driver.findElement(this.exp.getamountText()).click();
//        this.driver.findElement(this.exp.getamountText()).click();
//        this.driver.findElement(this.exp.getButtonKey2()).click();
//        this.driver.findElement(this.exp.getButtonKey1()).click();
//        this.driver.findElement(this.exp.getButtonKey2()).click();
//        this.driver.findElement(this.exp.getButtonKeyDecimal()).click();
//        this.driver.findElement(this.exp.getButtonKey1()).click();
//        this.driver.findElement(this.exp.getButtonKey2()).click();
//        this.driver.findElement(this.exp.getnoteText()).click();
//        this.driver.findElement(this.exp.getnoteText()).sendKeys("test");
//
//        this.driver.hideKeyboard();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(this.exp.getchooseCategory()));
//        this.driver.findElement(this.exp.getchooseCategory()).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(this.exp.getCategoryName()));
//        this.driver.findElement(this.exp.getCategoryName()).click();
    }

    @Then("an expense entry should get created")
    public void anExpenseEntryShouldGetCreated() {
        Assert.assertTrue(expenseScreen.getSnackBarText().isDisplayed());
    }

    @And("the balance amount should get updated")
    public void theBalanceAmountShouldGetUpdated() {
//        WebDriverWait wait = new WebDriverWait(this.driver, 10L);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(obj.getBalanceAmount()));
//
//        System.out.println(this.driver.findElement(this.obj.getBalanceAmount()).getAttribute("text"));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(this.obj.getBalanceAmount()));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(this.obj.getBalanceAmount())).getAttribute("text");
//        Assert.assertTrue(this.driver.findElement(this.obj.getBalanceAmount()).getAttribute("text").contains("$212.12"));

//        wait.until(ExpectedConditions.visibilityOf(dashboardScreen.getBalanceAmount()));
        library.waitForElementDisplay(driver, dashboardScreen.getBalanceAmount());
        Assert.assertTrue(dashboardScreen.getBalanceAmount().isDisplayed());

    }

}
