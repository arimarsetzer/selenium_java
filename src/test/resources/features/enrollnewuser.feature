# language: en

  @enrollnewcustomer
  Business Need: Usuário quer criar novo cadastro no ecommerce

    @enrollnewuser
    Scenario: Criar novo cadastro no ecommerce
      Given Estou na pagina inicial do ecommerce e clico no botao de cadastro
      When Insiro meu nome, email e clico em registrar
      Then Adiciono as informacoes restantes e clico em criar conta