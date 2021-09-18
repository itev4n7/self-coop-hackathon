package hackathon.epam.selfcoop.components;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketComponent {
    public WebElement checkOutToBasket = WebDriverWrapper.getDriver().findElement(By.cssSelector("a[class='btn btn-primary btn-block add-to-cart-button']"));
}
