package hackathon.epam.selfcoop.steps;

import hackathon.epam.selfcoop.common.JavascriptClass;
import hackathon.epam.selfcoop.components.RegistrationErrorComponent;
import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import hackathon.epam.selfcoop.pages.AcceleratorPage;
import hackathon.epam.selfcoop.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class UserRegistrationSteps {
    @Given("I go to website {string}")
    public void iGoToWebsite(String url) {
        WebDriverWrapper.getDriver().navigate().to(url);
    }

    @Given("I go to register page")
    public void iGoToRegisterPage() {
        AcceleratorPage acceleratorPage = new AcceleratorPage();
        JavascriptClass.clickUsingJs(acceleratorPage.headerComponent.singInOrRegisterButton);
    }

    @When("I fill all required fields")
    public void iFillAllRequiredFields(DataTable dataTable) {
        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);

        String firstName = rows.get(0).get("first name");
        String lastName = rows.get(0).get("last name");
        String email = rows.get(0).get("email");
        String password = rows.get(0).get("password");
        String repeatPassword = rows.get(0).get("repeat password");

        RegisterPage registerPage = new RegisterPage();
        registerPage.firstNameField.sendKeys(firstName);
        registerPage.lastNameField.sendKeys(lastName);
        registerPage.emailField.sendKeys(email);
        registerPage.passwordField.sendKeys(password);
        registerPage.confirmPasswordField.sendKeys(repeatPassword);
        JavascriptClass.clickUsingJs(registerPage.checkBoxOptions);
        JavascriptClass.clickUsingJs(registerPage.confirmCheckBox);
        JavascriptClass.clickUsingJs(registerPage.registerButton);
    }

    @Then("I see that I do not register to the website")
    public void iSeeThatIDoNotRegisterToTheWebsite() {
        String errorMessageText = "An account already exists for this email address.";
        RegistrationErrorComponent registrationErrorComponent = new RegistrationErrorComponent();
        Assert.assertEquals(registrationErrorComponent.errorMessage.getAttribute("innerText"), errorMessageText);
    }
}