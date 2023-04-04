# language: pt

  Funcionalidade: Cadastrar usuário
    Eu como usuário da aplicação
    quero me cadastrar no site
    para poder realizar compras online

    Cenario: Cadastrar um novo usuário
      Dado que eu acesso o site da loja
      E clico no link Cadastro
      E preencho todos os inputs do formulário
      Quando clico no botão Cadastrar
      Então o usuário será cadastrado com sucesso