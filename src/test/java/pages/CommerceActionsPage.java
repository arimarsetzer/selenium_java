package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Utils;

public class CommerceActionsPage extends Utils {

    WebDriver driver;

    public CommerceActionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() throws InterruptedException {
        WebElement productdetail_01 = driver.findElement(By.cssSelector("a[href='/product_details/1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productdetail_01);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("a[href='/product_details/1']")).click();
    }

    public void continueShoppingModal() {
        driver.findElement(By.cssSelector("button[class='btn btn-default cart']")).click();
        waitElementBeVisible(By.className("modal-content"), 5);
        WebElement modalAcceptButton = driver.findElement(By.cssSelector("button[class='btn btn-success close-modal btn-block']"));
        modalAcceptButton.click();
    }

    public void addSecondProductToCart() throws InterruptedException {
        WebElement productdetail_02 = driver.findElement(By.cssSelector("a[href='/product_details/2']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", productdetail_02);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("a[href='/product_details/2']")).click();
    }

    public void viewCartOnModal() {
        driver.findElement(By.cssSelector("button[class='btn btn-default cart']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("modal-content")));
        WebElement modalAcceptButton2 = driver.findElement(By.cssSelector(".text-center a[href='/view_cart']"));
        modalAcceptButton2.click();
    }

    public void enterCheckout() {
        driver.findElement(By.cssSelector("a[class='btn btn-default check_out']")).click();
    }

    public void placeOrder() throws InterruptedException {
        WebElement place_order = driver.findElement(By.cssSelector("a[href='/payment']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", place_order);
        Thread.sleep(500);

        driver.findElement(By.cssSelector("a[href='/payment']")).click();
    }

    public void fillPaymentMethod() {
        driver.findElement(By.cssSelector("input[data-qa='name-on-card']")).sendKeys("Test Card");
        driver.findElement(By.cssSelector("input[data-qa='card-number']")).sendKeys("1111 2222 3333 4444");
        driver.findElement(By.cssSelector("input[data-qa='cvc']")).sendKeys("123");
        driver.findElement(By.cssSelector("input[data-qa='expiry-month']")).sendKeys("02");
        driver.findElement(By.cssSelector("input[data-qa='expiry-year']")).sendKeys("2000");

        driver.findElement(By.id("submit")).click();
    }

    public void assertConfirmationPage() {
        driver.findElement(By.cssSelector("p[style='font-size: 20px; font-family: garamond;']")).getText().equals("Congratulations! Your order has been confirmed!");
    }

    public void confirmEmptyCart() {
        driver.findElement(By.cssSelector(".nav a[href='/view_cart']")).click();
        driver.findElement(By.cssSelector("p[class='text-center']")).getText().equals("Cart is empty! Click here to buy products.");
        driver.findElement(By.cssSelector(".nav a[href='/logout']")).click();
    }

}
