package hackathon.epam.selfcoop.components;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderComponent {
    public WebElement singInOrRegisterButton = WebDriverWrapper.getDriver().findElement(By.cssSelector("[href='/ucstorefront/en/login']"));

    public WebElement snowNavigationHeader = WebDriverWrapper.getDriver().findElement(By.cssSelector("[href='/ucstorefront/en/Collections/Snow/c/snow']"));
}
