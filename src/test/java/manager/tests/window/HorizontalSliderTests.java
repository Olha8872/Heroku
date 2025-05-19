package manager.tests.window;

import manager.core.TestBase;
import manager.pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends TestBase {

    @Test
    public void testSliderMovesTo3() {
        app.getDriver().get("https://the-internet.herokuapp.com/horizontal_slider");
        HorizontalSliderPage sliderPage = new HorizontalSliderPage(app.getDriver(), app.getWait());
        sliderPage.moveSliderTo("3");
        assertEquals(sliderPage.getSliderValue(), "3", "Slider did not move to correct value");
    }
}
