package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        tags = {"~@ignore"},
        glue = {"steps"}
)

public class RunCucumberTest {

    public static WebDriver driver;

    @BeforeClass
    public static void start() {

        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:/cursos/DesafioDatum/adblock_5_4_0_0.crx"));
        //options.addArguments("--headless", "--window-size=1440,900");
        DesiredCapabilities c = new DesiredCapabilities();
        c.setCapability(ChromeOptions.CAPABILITY, options);

        driver = new ChromeDriver(options);

        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void stop() {
        driver.quit();
    }

}
