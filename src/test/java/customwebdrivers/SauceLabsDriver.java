package customwebdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class SauceLabsDriver {

    public static void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        try {
            WebDriver driver = new RemoteWebDriver(
                    URI.create("link").toURL(),
                    capabilities
            );
            CustomWebDriver.setDriver(driver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void tearDown() {
        CustomWebDriver.getDriver().quit();
    }
}
