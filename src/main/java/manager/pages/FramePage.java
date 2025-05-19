package manager.pages;

import manager.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public FramePage switchToTopFrame(String frameName) {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(frameName); // "frame-left", "frame-middle", or "frame-right"
        return this;
    }


    public FramePage switchToBottomFrame() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        return this;
    }

    public FramePage verifyTextInFrame(String expectedText) {
        String bodyText = driver.findElement(By.tagName("body")).getText().trim();
        Assert.assertEquals(bodyText, expectedText);
        return this;
    }

    public FramePage switchToDefault() {
        driver.switchTo().defaultContent();
        return this;
    }
}
