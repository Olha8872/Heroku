package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "password")
    WebElement userPassword;

    @FindBy(name = "commit")
    WebElement loginButton;

    public LoginPage enterLoginCredentials(String emailAddr, String password) {
        type(userEmail, emailAddr);
        type(userPassword, password);
        return this;
    }

    public ProfilePage clickLoginButton() {
        click(loginButton);
        return new ProfilePage(driver, wait);
    }
}
