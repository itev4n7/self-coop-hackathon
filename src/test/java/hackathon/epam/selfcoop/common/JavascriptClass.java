package hackathon.epam.selfcoop.common;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptClass {

    public static void clickUsingJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) WebDriverWrapper.getDriver();
        executor.executeScript("arguments[0].click();", element);
    }
}
