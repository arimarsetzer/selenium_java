package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.pages.EnrollnewUserPage;
import steps.pages.HomePage;
import runner.RunCucumberTest;

public class EnrollNewUserStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);
    EnrollnewUserPage enroll = new EnrollnewUserPage();

    @Given("^Estou na pagina inicial do ecommerce e clico no botao de cadastro$")
    public void commerceHomePage() {
        homePage.enterLoginPage();
    }

    @When("^Insiro meu nome, email e clico em registrar$")
    public void fillEnrollFirstStep()  {
        enroll.enrollFirstStep();
    }

    @Then("^Adiciono as informacoes restantes e clico em criar conta$")
    public void fillEnrollSecondStepandFinish() {
        enroll.enrollSecondStep();
    }

}
