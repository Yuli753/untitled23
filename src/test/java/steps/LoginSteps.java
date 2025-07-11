package steps;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);

    @Given("I open the login page")
    public void open_login_page() {
        loginPage.open();
    }

    @When("I login with username {string} and password {string}")
    public void login_with_credentials(String user, String pass) {
        loginPage.login(user, pass);
    }

    @Then("I should see the products page")
    public void verify_success_login() {
        assertTrue(loginPage.isLoggedIn());
    }

    @Then("I should see an error message")
    public void verify_failed_login() {
        assertTrue(loginPage.isErrorVisible());
    }
}
