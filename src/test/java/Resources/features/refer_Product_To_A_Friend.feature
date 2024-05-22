Feature: refer a product to a friend

  @referProduct

  Scenario: As a user i should be able to login successfully and then refer a product to a friend
    Given I am on the homepage
    And I click on the log in button
    When I enter the Log in details
    Then I should be able to login successfully
    When I click on Electronics
    And I click on camera & photo
    And I clickon Leica T Mirrorless Digital Camera
    And I click on Email a friend button
    When I enter the details to for email a friend
    And I click on send email button
    Then I should be able to verify email has been sent successfully message


