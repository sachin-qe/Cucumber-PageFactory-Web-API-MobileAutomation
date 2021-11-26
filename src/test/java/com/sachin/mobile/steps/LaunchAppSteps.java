package com.sachin.mobile.steps;

import com.sachin.mobile.CommonLibrary;
import com.sachin.mobile.base.BaseClass;
import com.sachin.mobile.pages.DashboardScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;

import static org.testng.Assert.assertTrue;

public class LaunchAppSteps {

    static AppiumDriver<MobileElement> driver; // = BaseClass.setup();
    DashboardScreen dashboardScreen; // = PageFactory.initElements(driver, DashboardScreen.class);
    CommonLibrary library = new CommonLibrary();

    @Given("user have configured the setup")
    public void userHaveConfiguredTheSetup() {
        driver = BaseClass.setup();
        dashboardScreen = new DashboardScreen(driver);
    }

    @When("user is launching the app")
    public void userIsLaunching() {
        assertTrue(driver.isAppInstalled("com.monefy.app.lite"));
    }

    @Then("Dashboard gets opened")
    public void appShouldGetLaunch() {
        try {
            System.out.println(dashboardScreen.getPiegraph());
        } catch (NullPointerException e) {
//            Logger.getLogger(String.valueOf(e.getMessage()));
//            Logger.getLogger(String.valueOf(e.getStackTrace()));
            System.out.println("error message: " + e.getMessage());
//            System.out.println("get cause: " +e.getCause());
            System.out.println("trace:" + Arrays.toString(e.getStackTrace()));
        }
        library.waitForElementDisplay(driver, dashboardScreen.getPiegraph());
        library.elementDisplayCheck(dashboardScreen.getPiegraph());
        dashboardLoading();
    }

    public void launchAppTest() {
        assertTrue(dashboardScreen.getPiegraph().isDisplayed());
    }

    public void dashboardLoading() {
//        driver.findElement(By.id("com.monefy.app.lite:id/SliderDragView")).click();
//        assertTrue(this.driver.findElement(this.obj.getactionBar()).isDisplayed());
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.visibilityOf(dashboardScreen.getSliderDragView())).isDisplayed();
        dashboardScreen.getSliderDragView().click();
        assertTrue(dashboardScreen.getActionBar().isDisplayed());

    }

}
