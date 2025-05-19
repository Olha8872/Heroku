package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement clickHereLink;

    public void openNewWindow() {
        click(clickHereLink);
    }

    public void getAlertsFrameWindows() {

    }
}
