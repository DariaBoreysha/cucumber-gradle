package step;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.open;

public class BeforeStep {

    @Given("Open website {string}")
    public void openWebsite(String url) {
        WebDriverManager.firefoxdriver().setup();
        Configuration.headless = true;
        open(url);
    }
}
