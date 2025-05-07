package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(css = "div.header-user-name")
    WebElement userNameValue;

    public ProfilePage verifyUserName(String expectedText) {
        String actualText = userNameValue.getText();
        Assert.assertTrue(actualText.contains(expectedText), "Username does not contain the expected text. \nExpected: " + expectedText + "\nActual: " + actualText);
        return this;
    }
}
