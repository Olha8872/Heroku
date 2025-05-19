package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "input[type='range']")
    WebElement slider;

    @FindBy(id = "range")
    WebElement value;

    public void moveSliderTo(String targetValue) {
        while (!value.getText().equals(targetValue)) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue() {
        return value.getText();
    }
}
