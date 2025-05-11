package manager.tests;

import manager.core.TestBase;
import manager.pages.LoginPage;
import manager.pages.ProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {
        WebDriver driver = app.getDriver();
        WebDriverWait wait = app.getWait();


        WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']")));


        loginLink.click();


        ProfilePage profilePage = new LoginPage(driver, wait)
                .enterLoginCredentials("situk1981@gmail.com", "Feragamo123456!")
                .clickLoginButton();


        profilePage.verifyUserName("Olga Situk");
    }
}
