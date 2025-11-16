@InventorySaucedemo
Feature:Inventory Saucedemo


  Scenario: Agregar producto al carrito

    Given ingreso con el usuario standard_user y la password secret_sauce
    And presiono boton login
    And verifico que estoy en la homepage
    And realizo click en el boton add to cart del producto Sauce Labs Backpack
    And verifico que el contador del carrito tiene valor 1
    When realizo click en el boton remove del producto Sauce Labs Backpack
    Then verifico que carrito esta vacio




