package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPage extends BasePage {
    public DropDownPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public void selectOption(String value) {
        Select select = new Select(dropdown);
        select.selectByVisibleText(value);
    }

    public String getSelectedOption() {
        Select select = new Select(dropdown);
        return select.getFirstSelectedOption().getText();
    }

}
