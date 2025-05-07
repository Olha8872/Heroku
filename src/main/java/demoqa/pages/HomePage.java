package demoqa.pages;

import demoqa.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
        @FindBy()
        WebElement bookStore;

        public DropDownPanel getBookStore() {
            click(bookStore, 0, 350);
            return new DropDownPanel(driver, wait);
        }
    }
