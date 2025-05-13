package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    WebElement jsAlertBtn;

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    WebElement jsConfirmBtn;

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    WebElement jsPromptBtn;

    @FindBy(id = "result")
    WebElement result;

    public void clickAlertAndAccept() {
        click(jsAlertBtn);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void clickConfirm(boolean accept) {
        click(jsConfirmBtn);
        Alert alert = driver.switchTo().alert();
        if (accept) alert.accept();
        else alert.dismiss();
    }

    public void clickPrompt(String text) {
        click(jsPromptBtn);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public String getResultText() {
        return result.getText();
    }
}