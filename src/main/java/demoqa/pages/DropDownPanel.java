package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPanel extends BasePage {


    public DropDownPanel(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);

    }
    @FindBy()
    WebElement login;

    public LoginPage selectLogin() {
        click(login, 0,500);

        return new LoginPage(driver, wait);
}
}