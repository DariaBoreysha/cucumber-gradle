package step;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class BeforeStep {

    @Given("Open website {string}")
    public void openWebsite(String url) {
        Configuration.headless = true;
        open(url);
    }
}
