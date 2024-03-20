package step;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.sleep;

public class AfterStep {

    @After
    public void tearDown() throws InterruptedException{
        closeWebDriver();
    }

/*    @io.cucumber.java.AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }*/

}
