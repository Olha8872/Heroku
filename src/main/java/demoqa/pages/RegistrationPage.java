package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "self_declared_country")
    WebElement country;

    @FindBy(id = "signup-button")
    WebElement signupButton;

    public RegistrationPage fillRegistrationForm(String fName, String lName, String emailAddr, String companyName, String countryName) {
        type(firstName, fName);
        type(lastName, lName);
        type(email, emailAddr);
        type(company, companyName);

        // Выбор страны из выпадающего списка
        Select select = new Select(country);
        select.selectByVisibleText(countryName);

        return this;
    }

    public void submitRegistration() {
        click(signupButton);
    }
}
