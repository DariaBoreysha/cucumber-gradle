package step;

import io.cucumber.java.After;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class AfterStep {

    @After
    public static void tearDown() throws InterruptedException{
        closeWebDriver();
    }

/*    @io.cucumber.java.AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }*/

}
