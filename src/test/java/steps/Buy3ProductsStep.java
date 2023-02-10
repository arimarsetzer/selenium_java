package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommerceActionsPage;
import pages.HomePage;
import runner.RunCucumberTest;

public class Buy3ProductsStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);
    CommerceActionsPage commerce = new CommerceActionsPage(driver);

    @Given("^Estou logado na pagina do ecommerce$")
    public void loggedIntoECommerce() throws InterruptedException {
        homePage.accessApp();
    }

    @When("^Eu adiciono tres produtos ao carrinho$")
    public void addThreeProducts() throws InterruptedException {

        commerce.addFirstProductToCart();
        commerce.continueShoppingModal();
        homePage.accessApp();
        commerce.addSecondProductToCart();
        commerce.continueShoppingModal();
        homePage.accessApp();
        commerce.addThirdProductToCart();
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
