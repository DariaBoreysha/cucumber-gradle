package step;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Slf4j
public class LoginPageStep {
    @Given("Open website {string}")
    public void openURL(String url){
        open(url);
    }

    @Given("I am on basic page of website")
    public void checkingPageAddress() {
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
    @And("I am logged in with my {}")
    public void checkingPagePresence(String username) throws InterruptedException{
        assertTrue($("a#nameofuser.nav-link").shouldBe(Condition.visible).getText().contains(username));
    }

    @Then("I log out")
    public void loggingOut(){
        $("#logout2").click();
    }


    @When("I click on Log in button")
    public void iClickOnLogInButton() {
        $("#login2").click();
    }
}
