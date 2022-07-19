Feature: Test with login

  Scenario: Add address
    Given logs into website
    When enters address details
    Then address saved message is displayed


  Scenario: Add payment
    Given logs into website
    When clicks on add payment and enter details
    Then  payment saved message is displayed


  Scenario: Retrieve details of cart items
    Given logs into website
    When select previous orders
    Then delivery date is displayed
