package hackathon.epam.selfcoop.steps;

import hackathon.epam.selfcoop.common.JavascriptClass;
import hackathon.epam.selfcoop.components.BasketComponent;
import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import hackathon.epam.selfcoop.pages.AcceleratorPage;
import hackathon.epam.selfcoop.pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AddProductToBasketSteps {
    WebDriver driver = WebDriverWrapper.getDriver();
    Actions actions = new Actions(driver);

    @Given("I go to main website {string}")
    public void iGoToMainWebsite(String url) {
        driver.navigate().to(url);
    }

    @Given("I open category product page")
    public void iOpenCategoryProductPage() {
        AcceleratorPage acceleratorPage = new AcceleratorPage();
        actions.moveToElement(acceleratorPage.headerComponent.youthNavigationHeader);
        JavascriptClass.clickUsingJs(acceleratorPage.headerComponent.dcProductButton);
    }

    @When("I add product to the basket")
    public void iAddProductToTheBasket() {
        ProductPage productPage = new ProductPage();
        actions.moveToElement(productPage.dcProductItem);
        JavascriptClass.clickUsingJs(productPage.addToCart);
    }

    @Then("I see selected product is shown in the basket page")
    public void iSeeSelectedProductIsShownInTheBasketPage() {
        String orderTotal = "Order Total";
        BasketComponent basket = new BasketComponent();
        JavascriptClass.clickUsingJs(basket.checkOutToBasket);
    }
}
