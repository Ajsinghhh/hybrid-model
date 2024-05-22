Feature: Registration


  @register
  Scenario: As a user i should be able to register successfully, so that i can use all the functionality


    Given I am on the homepage
    And I click on the Register button
    When  I enter the registration details
    Then I should be able to register successfully