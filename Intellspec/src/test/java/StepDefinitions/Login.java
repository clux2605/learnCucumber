package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {

    @Given("^That I navigate to giftrete\\.com$")
    public void thatINavigateToGiftreteCom() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "C:/Users/owner/Documents/Learning/Intellspec/geckodriver.exe");

//Now you can Initialize marionette driver to launch firefox
       // DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        // capabilities.setCapability("marionette", true);
        // WebDriver driver = new MarionetteDriver(capabilities);

        WebDriver driver = new FirefoxDriver();
        String appUrl;
        appUrl = "https://giftrete.com";
        driver.get(appUrl);
    }

    @And("^I click on login$")
    public void iClickOnLogin() throws Throwable {
        WebDriver driver = new FirefoxDriver();
        driver.findElement(By.linkText("Login")).click();
    }

    @And("^I entered the username$")
    public void iEnteredTheUsername() throws Throwable {
        WebDriver driver = new FirefoxDriver();
        ((FirefoxDriver) driver).findElementByName("email").sendKeys("seunuser");
    }

    @And("^I entered the password$")
    public void iEnteredThePassword() throws Throwable {
        WebDriver driver = new FirefoxDriver();
        ((FirefoxDriver) driver).findElementByName("password").sendKeys("seunpassword");
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() throws Throwable {
        WebDriver driver = new FirefoxDriver();
        driver.findElement(By.className("le-button")).click();
    }

    @Then("^I should login$")
    public void iShouldLogin() throws Throwable {

    }

    @And("^I entered the invalid username$")
    public void iEnteredTheInvalidUsername() throws Throwable {

    }

    @Then("^I should not be able to login$")
    public void iShouldNotBeAbleToLogin() throws Throwable {

    }

    @And("^I entered the invalid password$")
    public void iEnteredTheInvalidPassword() throws Throwable {

    }

    @And("^I entered the username \"([^\"]*)\"$")
    public void iEnteredTheUsername(String username) throws Throwable {

    }

    @And("^I entered the password \"([^\"]*)\"$")
    public void iEnteredThePassword(String password) throws Throwable {

    }

    @And("^I logout$")
    public void iLogout() throws Throwable {

    }
}
