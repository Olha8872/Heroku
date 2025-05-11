package manager.pages;

import org.openqa.selenium.WebDriver;

public class BaseHelper {
    protected WebDriver driver;


    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }


    public void openUrl(String url) {
        driver.get(url);  // Open URL
    }


    public String getPageTitle() {
        return driver.getTitle();  // Header
    }
}
