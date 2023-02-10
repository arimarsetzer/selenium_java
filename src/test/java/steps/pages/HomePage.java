package steps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void accessApp() {
        driver.get("https://automationexercise.com/");
    }

    public void enterLoginPage() {
        driver.findElement(By.cssSelector("a[href='/login']")).click();

    }

    public void loginApp() {
        driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("datumqatest@soprock.com");
        driver.findElement(By.cssSelector("input[data-qa='login-password']")).sendKeys("datum2021");
        driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();
    }
}
