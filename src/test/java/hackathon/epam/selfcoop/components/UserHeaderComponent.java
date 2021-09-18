package hackathon.epam.selfcoop.components;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserHeaderComponent {

    public WebElement myAccountButton = WebDriverWrapper.getDriver().findElement(By.cssSelector(".nav__right .myAccountLinksHeader"));


}
