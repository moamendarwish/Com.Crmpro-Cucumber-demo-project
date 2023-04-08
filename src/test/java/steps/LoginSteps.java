package steps;


import com.crmpro.base.BaseCLass;
import com.crmpro.pages.HomePage;
import com.crmpro.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseCLass {
    LoginPage loginpage;
    HomePage homePage;

    @Given("user opens the website and goes to the login page")
    public void user_opens_the_website_and_goes_to_the_login_page() {
        launchBrowser();
    }

    @When("user enters valid credentials as {string} and {string}")
    public void user_enters_valid_credentials(String username, String password) {
        loginpage = new LoginPage();
        homePage = loginpage.performLogin(username, password);
    }

    @Then("user should be taken to home page")
    public void user_should_be_taken_to_home_page() {
        homePage.isLogoDisplayed();
    }

    @Then("error message should appear")
    public void error_message_should_appear() {
        loginpage.isUserNameDisplayed();
    }

}
