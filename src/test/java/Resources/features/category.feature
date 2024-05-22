Feature: category

  @category
  Scenario Outline: As a user , I should be able to navigate to each category page successfully
    Given I am on homepage
    When I click on "<category_name>" button
    Then I should be able to verify that user can navigate to "<url>" page
    Examples:
      | category_name     | url                |
      | Computers         | /computers         |
      | Electronics       | /electronics       |
      | Apparel           | /apparel           |
      | Digital downloads | /digital-downloads |
      | Books             | /books             |
      | Jewelry           | /jewelry           |
      | Gift Cards        | /gift-cards        |