Feature: search

  @search
  Scenario: As a user i should be able to search any text typed in the search bar
    Given I am on the homepage
    And I click on the search bar
    When I type any text in the search bar
    And I click on the search  button
    Then I should be able to see the result on the homepage

