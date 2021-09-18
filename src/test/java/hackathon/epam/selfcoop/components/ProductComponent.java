package hackathon.epam.selfcoop.components;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductComponent {
    public WebElement toolItemProduct = WebDriverWrapper.getDriver().findElement(By.cssSelector("[id='addToCartForm45576']"));
}
