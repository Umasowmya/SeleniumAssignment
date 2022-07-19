Feature: Tests without login
  Background: initialize driver
    When initialize driver


    Scenario: test today deals
      When click on today's deals and add item to cart
      Then verify item is added to cart

      Scenario: Test item details button
        When clicks on last item in mobiles section
        Then item details should be displayed

      Scenario: test sidebar
        When clicks on mobile phones button in sidebar
        Then should display mobile phones

