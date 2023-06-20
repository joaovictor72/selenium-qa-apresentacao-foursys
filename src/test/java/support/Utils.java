package support;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        //format={"pretty","html:reports/test-report"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}
)
public class Utils extends RunCucumberTest {
    public void esperarElementoEstarPresente(By element, int tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void esperarTresSegundos() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}