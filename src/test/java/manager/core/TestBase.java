package manager.core;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    protected ApplicationManager app = new ApplicationManager();


    @BeforeMethod
    public void setUp() {
        app.init();
        closeCookieBannerIfPresent();
    }

    private void closeCookieBannerIfPresent() {
        try {
            WebDriver driver = app.getDriver();
            WebElement acceptBtn = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.id("onetrust-accept-btn-handler")));
            acceptBtn.click();
        } catch (TimeoutException ignored) {
        }
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }
}
