package hackathon.epam.selfcoop.components;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderComponent {
    public WebElement singInOrRegisterButton = WebDriverWrapper.getDriver().findElement(By.cssSelector("[href='/ucstorefront/en/login']"));

    public WebElement youthNavigationHeader = WebDriverWrapper.getDriver().findElement(By.cssSelector("a[title='Youth']"));

    public WebElement dcProductButton = WebDriverWrapper.getDriver().findElement(By.cssSelector("a[title='DC']"));
}
