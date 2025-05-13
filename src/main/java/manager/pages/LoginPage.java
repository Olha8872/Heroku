package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    public LoginPage enterLoginCredentials(String email, String password) {
        driver.get("https://id.heroku.com/login");

        wait.until(ExpectedConditions.visibilityOf(userEmail)).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOf(userPassword)).sendKeys(password);

        return this;
    }

    public ProfilePage clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return new ProfilePage(driver, wait);
    }
}