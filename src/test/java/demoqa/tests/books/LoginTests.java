package demoqa.tests.books;

import demoqa.core.TestBase;
import demoqa.pages.HomePage;
import demoqa.pages.LoginPage;
import demoqa.pages.RegistrationPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait)
                .getBookStore()
                .selectLogin()
                .hideAds(); // No ads
    }

    @Test
    public void registrationTest() {
        new RegistrationPage(app.driver, app.wait)
                .fillRegistrationForm("Olga", "Situk", "situk1981@gmail.com", "situk1981@gmail.com", "Germany")
                .submitRegistration();
    }

    @Test
    public void loginPositiveTest() {
        new LoginPage(app.driver, app.wait)
                .enterLoginCredentials("situk1981@gmail.com", "Feragamo123456!")
                .clickLoginButton()
                .verifyUserName("Olga Situk");
    }
}
