package StepDefinitions;

import Pages.Login;
import Utilities.BrowserUtils;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class LoginStepDefs {


    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
      //  Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
   protected Login login=new Login();
    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {

        login.username.sendKeys(ConfigurationReader.getProperty("username"));
        login.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String title) {
      //login.loginButton.click();
        BrowserUtils.clickWithJS(login.loginButton);
      Assert.assertEquals(title,Driver.getDriver().getTitle());
      BrowserUtils.wait(5);

    }
}
