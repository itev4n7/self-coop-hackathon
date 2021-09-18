package hackathon.epam.selfcoop.customwebdrivers;

import org.openqa.selenium.WebDriver;

public class WebDriverWrapper {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private WebDriverWrapper() {}

    public static void setDriver(WebDriver customDriver) {
        driver.set(customDriver);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
