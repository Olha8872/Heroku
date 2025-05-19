package manager.tests.window;

import manager.core.TestBase;
import manager.pages.DropDownPanelPage;
import manager.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewWindowTests extends TestBase {
    HomePage homePage;

    @BeforeMethod
    public void precondition() {
        new HomePage(app.getDriver(), app.getWait()).getAlertsFrameWindows();
        new DropDownPanelPage(app.getDriver(), app.getWait()).selectBrowswerWindows().hideAds();
    }

    @Test
    public void testNewWindowOpensSuccessfully() {
        homePage = new HomePage(app.getDriver(), app.getWait());
        homePage.openNewWindow();

        WebDriver driver = app.getDriver();
        String mainWindow = driver.getWindowHandle();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        String pageTitle = driver.getTitle();
        System.out.println("New Window Title: " + pageTitle);

        Assert.assertTrue(driver.getPageSource().contains("New Window"), "New window content is not found");


        driver.close();
        driver.switchTo().window(mainWindow);
    }
}
