Feature: currency


  @currency
  Scenario: To verify each product on the homepage has a currency symbol displayed next to its price
    Given I am on homepage
    And I click on the currency drop down on the top left corner
    And I select Euro
    Then I should be able to verify that there is a Euro € Symbol next to the price


