package support;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public static WebDriverWait w;

    public void waitElementBeVisible(By element, int tempo) {
        w = new WebDriverWait(driver, tempo);
        w.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static String getRandomName(){

        String name_init = "Datum ";
        String name_final  = " QATest";

        Random random = new Random();
        int minimum = 1;
        int maximum = 999999999;
        int result = random.nextInt(maximum-minimum) + minimum;

        return name_init + result + name_final;
    }

    public static String getRandomEmail(){

        String email_init = "datum_test_";
        String email_final  = "@yopmail.com";

        Random random = new Random();
        int minimum = 1;
        int maximum = 999999999;
        int result = random.nextInt(maximum-minimum) + minimum;

        return email_init + result + email_final;
    }

}
