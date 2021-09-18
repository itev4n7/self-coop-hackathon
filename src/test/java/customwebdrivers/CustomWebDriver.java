package customwebdrivers;

import org.openqa.selenium.WebDriver;

public class CustomWebDriver {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private CustomWebDriver() {}

    public static void setDriver(WebDriver customDriver) {
        driver.set(customDriver);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }
}
