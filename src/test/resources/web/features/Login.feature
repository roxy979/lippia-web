@LoginSaucedemoParametros
Feature:Login Saucedemo

  @Loginexitoso
    Scenario: Usuario logueado exitosamente

    Given ingreso con el usuario standard_user y la password secret_sauce
    When presiono boton login
    Then verifico que estoy en la homepage

  @Loginfallido
    Scenario: Usuario logueado bloqueado

    Given ingreso el usuario incorrecto locked_out_user y la password secret_sauce
    When presiono boton login
    Then visualizo mensaje de ingreso incorrecto






