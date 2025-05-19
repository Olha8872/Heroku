package manager.tests.frame;

import manager.core.TestBase;
import manager.pages.FramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getDriver().get("https://the-internet.herokuapp.com/nested_frames");
    }


    @Test
    public void testLeftFrame() {
        new FramePage(app.getDriver(), app.getWait())
                .switchToTopFrame("frame-left")
                .verifyTextInFrame("LEFT")
                .switchToDefault();
    }

    @Test
    public void testMiddleFrame() {
        new FramePage(app.getDriver(), app.getWait())
                .switchToTopFrame("frame-middle")
                .verifyTextInFrame("MIDDLE")
                .switchToDefault();
    }

    @Test
    public void testRightFrame() {
        new FramePage(app.getDriver(), app.getWait())
                .switchToTopFrame("frame-right")
                .verifyTextInFrame("RIGHT")
                .switchToDefault();
    }

    @Test
    public void testBottomFrame() {
        new FramePage(app.getDriver(), app.getWait())
                .switchToBottomFrame()
                .verifyTextInFrame("BOTTOM")
                .switchToDefault();
    }
}
