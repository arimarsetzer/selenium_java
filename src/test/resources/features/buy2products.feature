# language: en

@buy2products
Business Need: Usuário quer comprar 2 produtos para se vestir melhor

  @buy2products
  Scenario: Comprar 2 produtos com sucesso
    Given Estou logado na pagina do ecommerce
    When Eu adiciono dois produtos ao carrinho
    Then Finalizo minha compra com sucesso