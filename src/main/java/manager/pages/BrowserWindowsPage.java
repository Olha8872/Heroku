package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class BrowserWindowsPage extends BasePage {

    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement clickHereButton;

    public BrowserWindowsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //New Window
    public BrowserWindowsPage openNewWindow() {
        click(clickHereButton);
        return this;
    }


    public BrowserWindowsPage switchToNewWindow(int index) {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        Assert.assertTrue(windowHandles.size() > index, "New window is not opened!");
        driver.switchTo().window(windowHandles.get(index));
        return this;
    }

    @FindBy(tagName = "h3")
    WebElement newWindowHeading;

    public BrowserWindowsPage verifyNewWindowTitle(String expectedTitle) {

        Assert.assertEquals(newWindowHeading.getText(), expectedTitle, "Wrong window title!");
        return this;
    }
}
