package manager.tests.window;

import manager.core.TestBase;
import manager.pages.DropDownPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownTests extends TestBase {

    @Test
    public void testDropdownOptionSelection() {
        app.getDriver().get("https://the-internet.herokuapp.com/dropdown");
        DropDownPage dropdownPage = new DropDownPage(app.getDriver(), app.getWait());
        dropdownPage.selectOption("Option 2");
        assertEquals(dropdownPage.getSelectedOption(), "Option 2", "Selected option is not correct");
    }
}
