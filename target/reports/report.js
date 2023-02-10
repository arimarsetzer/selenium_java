$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("enrollnewuser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 4,
  "name": "Usuário quer criar novo cadastro no ecommerce e comprar produtos",
  "description": "",
  "id": "usuário-quer-criar-novo-cadastro-no-ecommerce-e-comprar-produtos",
  "keyword": "Business Need",
  "tags": [
    {
      "line": 3,
      "name": "@enrollnewcustomer"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Criar novo cadastro no ecommerce",
  "description": "",
  "id": "usuário-quer-criar-novo-cadastro-no-ecommerce-e-comprar-produtos;criar-novo-cadastro-no-ecommerce",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@enrollnewuser"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Estou na pagina inicial do ecommerce e clico no botao de cadastro",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Insiro meu nome, email e clico em registrar",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Adiciono as informacoes restantes e clico em criar conta",
  "keyword": "Then "
});
formatter.match({
  "location": "EnrollNewUserStep.commerceHomePage()"
});
formatter.result({
  "duration": 3241123600,
  "status": "passed"
});
formatter.match({
  "location": "EnrollNewUserStep.fillEnrollFirstStep()"
});
formatter.result({
  "duration": 1804583500,
  "status": "passed"
});
formatter.match({
  "location": "EnrollNewUserStep.fillEnrollSecondStepandFinish()"
});
formatter.result({
  "duration": 4913551700,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Comprar 3 produtos com sucesso",
  "description": "",
  "id": "usuário-quer-criar-novo-cadastro-no-ecommerce-e-comprar-produtos;comprar-3-produtos-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@buy2products"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Estou logado na pagina do ecommerce",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Eu adiciono tres produtos ao carrinho",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Finalizo minha compra com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "Buy3ProductsStep.loggedIntoECommerce()"
});
formatter.result({
  "duration": 5260000100,
  "status": "passed"
});
formatter.match({
  "location": "Buy3ProductsStep.addThreeProducts()"
});
formatter.result({
  "duration": 20201362200,
  "status": "passed"
});
formatter.match({
  "location": "Buy3ProductsStep.endCommerceProcess()"
});
formatter.result({
  "duration": 10581385200,
  "status": "passed"
});
});