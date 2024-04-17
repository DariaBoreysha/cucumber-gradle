package step;

import ch.qos.logback.classic.Level;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@Slf4j
public class AfterStep {

    @AfterAll
    public static void tearDown(){
        closeWebDriver();
    }

/*    @io.cucumber.java.AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }*/

}
