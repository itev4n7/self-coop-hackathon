package hackathon.epam.selfcoop.pages;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage {
    public WebElement dcProductItem = WebDriverWrapper.getDriver().findElement(By.cssSelector("a[title^='Del Chaos']"));
    public WebElement addToCart = WebDriverWrapper.getDriver().findElement(By.cssSelector("div[class='addtocart'] button[type='submit']"));
}
