$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("buy2products.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 4,
  "name": "Usuário quer comprar 2 produtos para se vestir melhor",
  "description": "",
  "id": "usuário-quer-comprar-2-produtos-para-se-vestir-melhor",
  "keyword": "Business Need",
  "tags": [
    {
      "line": 3,
      "name": "@buy2products"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Comprar 2 produtos com sucesso",
  "description": "",
  "id": "usuário-quer-comprar-2-produtos-para-se-vestir-melhor;comprar-2-produtos-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@buy2products"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Estou logado na pagina do ecommerce",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Eu adiciono dois produtos ao carrinho",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Finalizo minha compra com sucesso",
  "keyword": "Then "
});
formatter.match({
  "location": "Buy2ProductsStep.loggedIntoECommerce()"
});
formatter.result({
  "duration": 7978778000,
  "status": "passed"
});
formatter.match({
  "location": "Buy2ProductsStep.addTwoProducts()"
});
formatter.result({
  "duration": 7740286400,
  "status": "passed"
});
formatter.match({
  "location": "Buy2ProductsStep.endCommerceProcess()"
});
formatter.result({
  "duration": 8984610000,
  "status": "passed"
});
formatter.uri("enrollnewuser.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: en"
    }
  ],
  "line": 4,
  "name": "Usuário quer criar novo cadastro no ecommerce",
  "description": "",
  "id": "usuário-quer-criar-novo-cadastro-no-ecommerce",
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
  "id": "usuário-quer-criar-novo-cadastro-no-ecommerce;criar-novo-cadastro-no-ecommerce",
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
  "duration": 910859700,
  "status": "passed"
});
formatter.match({
  "location": "EnrollNewUserStep.fillEnrollFirstStep()"
});
formatter.result({
  "duration": 1253563800,
  "status": "passed"
});
formatter.match({
  "location": "EnrollNewUserStep.fillEnrollSecondStepandFinish()"
});
formatter.result({
  "duration": 4104998400,
  "status": "passed"
});
});