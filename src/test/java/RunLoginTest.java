import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
//added smth new
@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:reports/test-report.html","json:reports/cucumber-report.json"})
public class RunLoginTest {
}
