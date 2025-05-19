package manager.tests.window;

import manager.core.TestBase;
import manager.pages.ContextMenuPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends TestBase {

    @Test
    public void testRightClickAlertText() {
        app.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        ContextMenuPage contextMenuPage = new ContextMenuPage(app.getDriver(), app.getWait());
        String alertText = contextMenuPage.contextClickAndGetAlertText();
        assertEquals(alertText, "You selected a context menu", "Alert text is not correct");
    }
}
