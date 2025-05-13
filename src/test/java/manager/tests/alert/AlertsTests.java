package manager.tests.alert;

import manager.core.TestBase;
import manager.pages.AlertsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {
    private AlertsPage alertsPage;

    @BeforeMethod
    public void setUpTest() {
        app.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");
        alertsPage = new AlertsPage(app.getDriver(), app.getWait());
    }

    @Test
    public void jsAlertTest() {
        alertsPage.clickAlertAndAccept();
        Assert.assertEquals(alertsPage.getResultText(), "You successfully clicked an alert", "Alert message mismatch.");
    }

    @Test
    public void jsConfirmOkTest() {
        alertsPage.clickConfirm(true);
        Assert.assertEquals(alertsPage.getResultText(), "You clicked: Ok", "Confirmation message mismatch.");
    }

    @Test
    public void jsPromptTest() {
        String input = "TestUser";
        alertsPage.clickPrompt(input);
        Assert.assertEquals(alertsPage.getResultText(), "You entered: " + input, "Prompt message mismatch.");
    }
}
