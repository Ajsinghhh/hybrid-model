Feature: new release comment

  @newReleaseComment
  Scenario: As a user i should be able to verify that the comment is displayed on the bottom of the comment list
    Given I am on the homepage
    And I click on the nopCommerce new release!
    When I enter the detail
    And I click the NEW COMMENT
    Then I should be able to verify my comment is displayed on the bottom of the list
