package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;
import org.openqa.selenium.support.ui.Select;

public class EnrollnewUserPage extends RunCucumberTest {

    public void enrollFirstStep(){
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys(Utils.getRandomName());
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys(Utils.getRandomEmail());
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();
    }

    public void enrollSecondStep(){
        Select ddDay = new Select(driver.findElement(By.id("days")));
        Select ddMonth = new Select(driver.findElement(By.id("months")));
        Select ddYear = new Select(driver.findElement(By.id("years")));
        Select ddCountry = new Select(driver.findElement(By.id("country")));

        //For some reason, Select strategy is not working

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("datum2021");

        driver.findElement(By.id("uniform-days")).click();
        driver.findElement(By.cssSelector("#days [value='9']")).click();

        driver.findElement(By.id("uniform-months")).click();
        driver.findElement(By.cssSelector("#months [value='2']")).click();

        driver.findElement(By.id("uniform-years")).click();
        driver.findElement(By.cssSelector("#years [value='2021']")).click();

        driver.findElement(By.id("first_name")).sendKeys("Datum");
        driver.findElement(By.id("last_name")).sendKeys("QA");
        driver.findElement(By.id("company")).sendKeys("Datum");
        driver.findElement(By.id("address1")).sendKeys("1638 Marion Street");

        driver.findElement(By.id("country")).click();
        driver.findElement(By.cssSelector("#country [value='United States']")).click();

        driver.findElement(By.id("state")).sendKeys("Vermont");
        driver.findElement(By.id("city")).sendKeys("Alburg");
        driver.findElement(By.id("zipcode")).sendKeys("05440");
        driver.findElement(By.id("mobile_number")).sendKeys("123 456 789");
        driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();
        driver.findElement(By.cssSelector(".col-sm-9 h2")).getText().equals("ACCOUNT CREATED!");

    }

}
