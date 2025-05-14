package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContextMenuPage extends BasePage {

    public ContextMenuPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "hot-spot")
    WebElement hotSpotBox;

    public String contextClickAndGetAlertText() {
        Actions actions = new Actions(driver);
        actions.contextClick(hotSpotBox).perform();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        alert.accept();
        return text;
    }
}

