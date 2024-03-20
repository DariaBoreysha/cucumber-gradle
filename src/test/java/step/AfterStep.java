package step;

import org.junit.jupiter.api.AfterAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AfterStep {

    @AfterAll
    public static void tearDown() throws InterruptedException{
        closeWebDriver();
    }

/*    @io.cucumber.java.AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }*/

}
