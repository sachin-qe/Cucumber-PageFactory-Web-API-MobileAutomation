package com.sachin.mobile.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpenseScreen {
    AppiumDriver <MobileElement> driver;

    public ExpenseScreen(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public MobileElement getAmountTextBox() {
        return amountTextBox;
    }

    public MobileElement getAmountText() {
        return amountText;
    }

    public MobileElement getNoteText() {
        return noteText;
    }

    public MobileElement getButtonKey1() {
        return buttonKey1;
    }

    public MobileElement getButtonKey2() {
        return buttonKey2;
    }

    public MobileElement getButtonKey3() {
        return buttonKey3;
    }

    public MobileElement getButtonKeyDecimal() {
        return buttonKeyDecimal;
    }

    public MobileElement getButtonKey5() {
        return buttonKey5;
    }

    public MobileElement getLayoutRoot() {
        return layoutRoot;
    }

    public MobileElement getChooseCategory() {
        return chooseCategory;
    }

    public MobileElement getCategoryName() {
        return categoryName;
    }

    public MobileElement getSnackBarText() {
        return snackBarText;
    }

    public MobileElement getSnackBarAction() {
        return snackBarAction;
    }

    public MobileElement getExpenseAmount() {
        return expenseAmount;
    }

    @FindBy(id = "com.monefy.app.lite:id/button_amount_container")
    MobileElement amountTextBox;

    @FindBy(id = "com.monefy.app.lite:id/amount_text")
    MobileElement amountText;

    @FindBy(id = "com.monefy.app.lite:id/textViewNote")
    MobileElement noteText;

    @FindBy(id = "com.monefy.app.lite:id/buttonKeyboard1")
    MobileElement buttonKey1;

    @FindBy(id = "com.monefy.app.lite:id/buttonKeyboard2")
    MobileElement buttonKey2;

    @FindBy(id = "com.monefy.app.lite:id/buttonKeyboard3")
    MobileElement buttonKey3;

    @FindBy(id = "com.monefy.app.lite:id/amount_text")
    MobileElement buttonKeyDecimal;

    @FindBy(id = "com.monefy.app.lite:id/buttonKeyboard5")
    MobileElement buttonKey5;

    @FindBy(id = "com.monefy.app.lite:id/relativeLayoutRoot")
    MobileElement layoutRoot;

    @FindBy(id = "com.monefy.app.lite:id/keyboard_action_button")
    MobileElement chooseCategory;

    @FindBy(xpath = "//android.widget.GridView/android.widget.FrameLayout[7]/android.widget.LinearLayout/android.widget.ImageView")
    MobileElement categoryName;

    @FindBy(id = "com.monefy.app.lite:id/snackbar_text")
    MobileElement snackBarText;

    @FindBy(id = "com.monefy.app.lite:id/snackbar_action")
    MobileElement snackBarAction;

    @FindBy(id = "com.monefy.app.lite:id/expense_amount_text")
    MobileElement expenseAmount;

}


//public class ExpenseScreen {
//    By amountTextBox = By.id("com.monefy.app.lite:id/button_amount_container");
//    By amountText = By.id("com.monefy.app.lite:id/amount_text");
//    By noteText = By.id("com.monefy.app.lite:id/textViewNote");
//    By buttonKey1 = By.id("com.monefy.app.lite:id/buttonKeyboard1");
//    By buttonKey2 = By.id("com.monefy.app.lite:id/buttonKeyboard2");
//    By buttonKey3 = By.id("com.monefy.app.lite:id/buttonKeyboard1");
//    By buttonKeyDecimal = By.id("com.monefy.app.lite:id/buttonKeyboardDot");
//    By buttonKey5 = By.id("com.monefy.app.lite:id/buttonKeyboard5");
//    By layoutRoot = By.id("com.monefy.app.lite:id/relativeLayoutRoot");
//    By chooseCategory = By.id("com.monefy.app.lite:id/keyboard_action_button");
//    By categoryName = By.xpath("//android.widget.GridView/android.widget.FrameLayout[7]/android.widget.LinearLayout/android.widget.ImageView");
//
//    By snackBarText = By.id("com.monefy.app.lite:id/snackbar_text");
////    By snackBarAction = By.id("com.monefy.app.lite:id/snackbar_action");
//
//    By expenseAmount = By.id("com.monefy.app.lite:id/expense_amount_text");
//
//    public By getExpenseAmount(){
//        return this.expenseAmount;
//    }
//
//    public By getsnackBarText() {
//        return this.snackBarText;
//    }
//
//    public By getCategoryName() {
//        return this.categoryName;
//    }
//
//    public By getchooseCategory() {
//        return this.chooseCategory;
//    }
//
//    public By getlayoutRoot() {
//        return this.layoutRoot;
//    }
//    public By getamountTextBox() {
//        return this.amountTextBox;
//    }
//
//    public By getamountText() {
//        return this.amountText;
//    }
//
//    public By getnoteText() {
//        return this.noteText;
//    }
//
//    public By getButtonKey1() {
//        return this.buttonKey1;
//    }
//
//    public By getButtonKey2() {
//        return this.buttonKey2;
//    }
//
//    public By getButtonKey3() {
//        return this.buttonKey3;
//    }
//
//    public By getButtonKeyDecimal() {
//        return this.buttonKeyDecimal;
//    }
//
//    public By getButtonKey5() {
//        return this.buttonKey5;
//    }
//}
