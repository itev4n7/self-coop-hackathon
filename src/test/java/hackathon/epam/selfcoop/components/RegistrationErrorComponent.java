package hackathon.epam.selfcoop.components;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationErrorComponent {
    public WebElement errorMessage = WebDriverWrapper.getDriver().findElement(By.cssSelector("[id='email.errors']"));
}
