package hackathon.epam.selfcoop.pages;

import hackathon.epam.selfcoop.customwebdrivers.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;

public class RegisterPage {
    private WebDriver driver = WebDriverWrapper.getDriver();

    public WebElement firstNameField = driver.findElement(cssSelector("[id='register.firstName']"));

    public WebElement lastNameField = driver.findElement(cssSelector("[id='register.lastName']"));

    public WebElement emailField = driver.findElement(cssSelector("[id='register.email']"));

    public WebElement passwordField = driver.findElement(cssSelector("[id='password']"));

    public WebElement confirmPasswordField = driver.findElement(cssSelector("[id='register.checkPwd']"));

    public WebElement checkBoxOptions = driver.findElement(cssSelector("[id='consentForm.consentGiven1']"));

    public WebElement confirmCheckBox = driver.findElement(cssSelector("[id='registerChkTermsConditions']"));

    public WebElement registerButton = driver.findElement(By.xpath("//button[normalize-space(text())='Register']"));
}
