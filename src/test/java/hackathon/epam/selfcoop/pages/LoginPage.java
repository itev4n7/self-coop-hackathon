package hackathon.epam.selfcoop.pages;

import hackathon.epam.selfcoop.components.HeaderComponent;
import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public HeaderComponent headerComponent = new HeaderComponent();

    public WebElement emailField = WebDriverWrapper.getDriver().findElement(By.cssSelector("#j_username"));

    public WebElement passwordField = WebDriverWrapper.getDriver().findElement(By.cssSelector("#j_password"));

    public WebElement submitButton = WebDriverWrapper.getDriver().findElement(By.cssSelector("#loginForm [type=\"submit\"]"));

}
