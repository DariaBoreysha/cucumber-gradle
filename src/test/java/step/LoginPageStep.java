package step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.function.BooleanSupplier;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginPageStep {

    @Given("I am on basic page of website")
    public void openWebSite() {
        assertEquals(WebDriverRunner.url(), "https://www.demoblaze.com/");
    }

    @And("I click on submit button")
    public void clickOnSubmitButton() {
       $(By.xpath(".//button[@onclick='logIn()']")).click();
    }

    @When("I enter {} and {}")
    public void iEnterAnd(String username, String password) {
        $("#loginusername").setValue(username);
        $("#loginpassword").setValue(password);
    }
    @Then("I am logged in with my {}")
    public void checkingPagePresence(String username) throws InterruptedException{
        assertTrue($("a#nameofuser.nav-link").shouldBe(Condition.visible).getText().contains(username));
    }


    @When("I click on Log in button")
    public void iClickOnLogInButton() {
        $("#login2").click();
    }
}
