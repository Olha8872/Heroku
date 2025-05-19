package manager.tests.window;

import manager.core.TestBase;
import manager.pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HoversTests extends TestBase {

    @Test
    public void testHoverShowsCaption() {
        app.getDriver().get("https://the-internet.herokuapp.com/hovers");
        HoversPage hoversPage = new HoversPage(app.getDriver(), app.getWait());
        assertTrue(hoversPage.hoverOverFirstFigure(), "Caption is not visible after hover");
    }
}
