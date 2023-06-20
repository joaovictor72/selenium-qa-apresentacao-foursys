# language: pt

Funcionalidade: Login Heroku

  @login
  Esquema do Cenário: Login no site heroku
    Dado efetuei o login no sistema utilizando o usuario <usuario> e a senha <senha>
    Exemplos:
      | usuario    | senha   |
      | tomsmith | SuperSecretPassword |