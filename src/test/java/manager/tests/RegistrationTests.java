package manager.tests;

import manager.core.TestBase;
import manager.pages.RegistrationPage;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase {

    @Test
    public void registrationTest() {
        new RegistrationPage(app.getDriver())
                .fillRegistrationForm("Olga", "Situk", "situk1981@gmail.com", "situk1981", "Germany")
                .submitRegistration();
    }
}
