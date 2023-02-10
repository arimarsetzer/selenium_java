package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.pages.CommerceActionsPage;
import steps.pages.HomePage;
import runner.RunCucumberTest;

public class Buy2ProductsStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);
    CommerceActionsPage commerce = new CommerceActionsPage(driver);

    @Given("^Estou logado na pagina do ecommerce$")
    public void loggedIntoECommerce() throws InterruptedException {
        homePage.enterLoginPage();
        homePage.loginApp();
    }

    @When("^Eu adiciono dois produtos ao carrinho$")
    public void addTwoProducts() throws InterruptedException {

        commerce.addFirstProductToCart();
        commerce.continueShoppingModal();
        homePage.accessApp();
        commerce.addSecondProductToCart();
        commerce.viewCartOnModal();
    }

    @Then("^Finalizo minha compra com sucesso$")
    public void endCommerceProcess() throws InterruptedException {
        commerce.enterCheckout();
        commerce.placeOrder();
        commerce.fillPaymentMethod();
        commerce.assertConfirmationPage();
        commerce.confirmEmptyCart();
    }

}
