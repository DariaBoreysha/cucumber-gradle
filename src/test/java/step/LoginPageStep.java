package step;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginPageStep {

    @Given("I am on login page")
    public void openWebSite() {
        assertEquals(WebDriverRunner.url(), "https://www.saucedemo.com/");
    }

    @And("I click on submit button")
    public void clickOnSubmitButton() {
        Selenide.$("#login-button").click();
    }

    @When("I enter {} and {}")
    public void iEnterAnd(String username, String password) {
        Selenide.$("#user-name").setValue(username);
        Selenide.$("#password").setValue(password);
    }
    @Then("I get on Products page")
    public void checkingPagePresence() {
        assertEquals(Selenide.$(".title").text(), "Products");
    }


}
