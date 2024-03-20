package step;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.BeforeAll;

public class BeforeStep {
    @BeforeAll
    public static void setup() {
        Configuration.headless = true;
    }
}
