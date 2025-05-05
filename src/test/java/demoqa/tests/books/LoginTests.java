package demoqa.tests.books;

import demoqa.core.TestBase;
import demoqa.pages.DropDownPanel;
import demoqa.pages.HomePage;
import demoqa.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(app.driver, app.wait).getBookStore();
        new DropDownPanel(app.driver, app.wait).selectLogin();
    }

    @Test
    public void loginPositiveest() {
        new LoginPage(app.driver, app.wait)
                .enterPersonalData("situk1981@gmail.com", "Feragamo123456!")
                .clickLoginButton()
                .verifyUserName("situk1981@gmail.com");


    }
}

