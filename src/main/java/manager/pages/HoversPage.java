package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }


    @FindBy(className = "figure")
    List<WebElement> figures;

    @FindBy(className = "figcaption")
    List<WebElement> captions;

    public boolean hoverOverFirstFigure() {
        WebElement element = figures.get(0);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        return captions.get(0).isDisplayed();
    }
}
