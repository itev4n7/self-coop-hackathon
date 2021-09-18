package hackathon.epam.selfcoop.steps;

import hackathon.epam.selfcoop.common.JavascriptClass;
import hackathon.epam.selfcoop.components.UserHeaderComponent;
import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import hackathon.epam.selfcoop.pages.AcceleratorPage;
import hackathon.epam.selfcoop.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;


public class UserLoginSteps {

    @Given("I go to {string}")
    public void i_go_to_url(String url) {
        WebDriverWrapper.getDriver().navigate().to(url);
    }

    @Given("I go to sing in page")
    public void i_go_to_sing_in_page() {
        AcceleratorPage acceleratorPage = new AcceleratorPage();
        JavascriptClass.clickUsingJs(acceleratorPage.headerComponent.singInOrRegisterButton);
    }

    @When("I login with {string} email and {string} password")
    public void login_with_email_and_password(String email, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.emailField.sendKeys(email);
        loginPage.passwordField.sendKeys(password);
        JavascriptClass.clickUsingJs(loginPage.submitButton);
    }

    @Then("I see that i logged in")
    public void i_see_that_i_logged_in() {
        String myAccountText = "My Account";
        UserHeaderComponent userHeaderComponent = new UserHeaderComponent();
        Assert.assertEquals(userHeaderComponent.myAccountButton.getAttribute("innerText"), myAccountText);
    }
}
