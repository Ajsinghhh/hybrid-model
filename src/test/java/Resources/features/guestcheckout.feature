Feature: Guest Checkout

  @GuestCheckout
  Scenario: As a user i should be able to buy a product as a guest
    Given I am on the homepage
    And I click on ADD TO CART button for HTC One Android Lollipop
    And I click on shopping cart
    When i click on check box for terms and service and click on continue
    When I click on CHECKOUT AS GUEST
    When I enter the Billing address
    And I click on CONTINUE button
    When I click on radio button Next Day Air ($0.00)
    And I click on CONTINUE button
    When I click on credit cart radio button
    And I click on CONTINUE button
    When I enter the payment details
    And I click on CONTINUE button
    When I click on CONFIRM button
    Then I should be able to see the order has been successfully processed and order number displayed




