package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownPanelPage extends BasePage {

    public DropDownPanelPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    @FindBy(css = "ul[id='glostick__menu--navigator'] li:nth-child(1)")
    WebElement dashboard;

    @FindBy(css = "ul[id='glostick__menu--navigator'] li:nth-child(2)")
    WebElement data;

    @FindBy(css = "ul[id='glostick__menu--navigator'] li:nth-child(3)")
    WebElement dataclips;

    @FindBy(css = "ul[id='glostick__menu--navigator'] li:nth-child(4)")
    WebElement elements;

    @FindBy(css = "body > div:nth-child(3) > nav:nth-child(1) > div:nth-child(3) > ul:nth-child(2) > li:nth-child(5)")
    WebElement documentation;

    @FindBy(css = "body > div:nth-child(3) > nav:nth-child(1) > div:nth-child(3) > ul:nth-child(2) > li:nth-child(6)")
    WebElement support;

    public DropDownPanelPage selectDashboard() {
        click(dashboard);
        return this;
    }

    public DropDownPanelPage selectData() {
        click(data);
        return this;
    }

    public DropDownPanelPage selectDataclips() {
        click(dataclips);
        return this;
    }

    public DropDownPanelPage selectElements() {
        click(elements);
        return this;
    }

    public DropDownPanelPage selectDocumentation() {
        click(documentation);
        return this;
    }

    public DropDownPanelPage selectBrowswerWindows() {
        driver.get("https://the-internet.herokuapp.com/windows");
        return this;
    }
}
