package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
    CheckoutCompletedPage checkoutCompletedPage = new CheckoutCompletedPage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    SearchPage searchPage = new SearchPage();


    @Test
    public void toVerifyUserShouldBeAbleToRegisterSuccessfully() {

        //Click On Register Button
        homePage.clickOnRegisterButton();
        //Enter Registration Details
        registrationPage.enterRegistrationDetails();
        //Verify User Registered Successfully With Correct Message Displayed
        registrationResultPage.verifyUserRegisteredSuccessfully();
    }


    @Test
    public void CheckoutAsGuest() {

        //Open browser
        //Type Url
        //Click on add to cart for HTC One M8 Android L 5.0 Lollipop
        homePage.clickOnAddToCartButtonForHTCOneM8AndroidL50Lollipop();
        //Click on shopping cart
        homePage.clickOnShoppingCartButton();
        //Click cn check Box for Terms of service Statement then click on Checkout
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        //Click cn Checkout as guest
        checkOutAsGuestPage.clickOnCheckoutAsGuestButton();
        //enter Details for billing address
        billingAddressPage.enterBillingAddressDetails();
        //Enter Shipping method details
        shippingMethodPage.shippingMethod();
        //Click on Radio button Credit Card and click continue
        paymentMethodPage.creditCard();
        //Enter payment details and click continue
        paymentInfoPage.enterPaymentDetails();
        //verify message Order successfully placed  and order number
        orderConfirmationPage.confirmOrder();
        //verify the message displayed
        checkoutCompletedPage.verifyOrderSuccessMessageDisplayed();

    }


    @Test
    public void search() {

        searchPage.searchItem("Floral");

    }
}





