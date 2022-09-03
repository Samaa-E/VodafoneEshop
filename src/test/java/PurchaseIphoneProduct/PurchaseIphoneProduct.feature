Feature: Validate error message on purchasing an iphone product with empty Full Name
  Scenario: Adding iphone product to Cart and Checkout with empty Full Name
    Given User opens vodafone eshop Home Page
    And User Choose English Language
    When User selects iphone products
    And User select a product
    And User added a product to basket
    And User Checkout
    And User entered Address
    And User click continue with empty Full Name
    Then Error Message appears with text "Please enter a valid name"