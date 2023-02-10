# language: en

  @enrollnewcustomer
  Business Need: Usuário quer criar novo cadastro no ecommerce e comprar produtos

    @enrollnewuser
    Scenario: Criar novo cadastro no ecommerce
      Given Estou na pagina inicial do ecommerce e clico no botao de cadastro
      When Insiro meu nome, email e clico em registrar
      Then Adiciono as informacoes restantes e clico em criar conta

    @buy2products
    Scenario: Comprar 2 produtos com sucesso
      Given Estou logado na pagina do ecommerce
      When Eu adiciono dois produtos ao carrinho
      Then Finalizo minha compra com sucesso