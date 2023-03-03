Feature: E2E adding a product to cart

  Scenario: Adding a product to Cart in application
    Given Landing on home page of demoblaze
    When filter for laptops
    And Add the laptop to cart of pplication
    Then Validating
