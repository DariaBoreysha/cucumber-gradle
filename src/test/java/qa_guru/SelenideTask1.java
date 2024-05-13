package qa_guru;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class SelenideTask1 {

    @Test
    public void gitHubPageDownloadTest() {
        Configuration.headless = false;
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldBe(visible);
        assertEquals("https://github.com/enterprise", WebDriverRunner.url());
    }

    @Test
    public void dragAndDropTest() {
        Configuration.headless = false;
        SelenideElement columnA = $("#column-a");
        SelenideElement columnB = $("#column-b");
        open("https://the-internet.herokuapp.com/drag_and_drop");
        assertTrue($("#columns div:first-child").getText().equals("A"));
        actions().dragAndDrop(columnA, columnB).build().perform();
        assertTrue($("#columns div:first-child").getText().equals("B"));
    }

}
