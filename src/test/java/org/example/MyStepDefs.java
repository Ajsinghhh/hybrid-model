package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

//Class Name
public class MyStepDefs extends Utils {

    //Object for HomePage Class
    HomePage homePage = new HomePage();
    //Object for RegistrationPage class
    RegistrationPage registrationPage = new RegistrationPage();
    //Object for RegistrationResultPage class
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {

    }

    @Given("I click on the Register button")
    public void i_click_on_the_register_button() {
        homePage.clickOnRegisterButton();

    }

    @When("I enter the registration details")
    public void i_enter_the_registration_details() {
        registrationPage.enterRegistrationDetails();

    }

    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        registrationResultPage.verifyUserRegisteredSuccessfully();

    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }


    @When("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        homePage.clickOnGivenButton(buttonName);
    }

    @Then("I should be able to verify that user can navigate to {string} page")
    public void iShouldBeAbleToVerifyThatUserCanNavigateToPage(String url_contains) {
        verifyURLContains(url_contains);
    }

    @And("I click on the currency drop down on the top left corner")
    public void iClickOnTheCurrencyDropDownOnTheTopLeftCorner() {
        homePage.clickOnCurrencyDropDown();
    }

    @And("I select Euro")
    public void iSelectEuro() {
        homePage.selectCurrency();
    }

    @Then("I should be able to verify that there is a Euro € Symbol next to the price")
    public void iShouldBeAbleToVerifyThatThereIsAEuro€SymbolNextToThePrice() {
        homePage.verifyAssertForDollarAndEuro();
    }

    @And("I click on the search bar")
    public void iClickOnTheSearchBar() {
        homePage.clickOnSearchBar();
    }

    @When("I type any text in the search bar")
    public void iTypeAnyTextInTheSearchBar() {
        homePage.typeAnyTextInTheSearchBar("Floral");
    }

    @And("I click on the search  button")
    public void iClickOnTheSearchButton() {
        homePage.clickOnSearchSubmitButton();
    }

    @Then("I should be able to see the result on the homepage")
    public void iShouldBeAbleToSeeTheResultOnTheHomepage() {
        homePage.verifySearchItem("Nike");
    }

    @And("I click on the log in button")
    public void iClickOnTheLogInButton() {
        homePage.clickOnLoginButton();
    }


    @And("I click on ADD TO CART button for HTC One Android Lollipop")
    public void iClickOnADDTOCARTButtonForHTCOneAndroidLollipop() {
        homePage.clickOnAddToCartButtonForHTCOneM8AndroidL50Lollipop();
    }

    @And("I click on shopping cart")
    public void iClickOnShoppingCart() {
        homePage.clickOnShoppingCartButton();
    }


    @When("i click on check box for terms and service and click on continue")
    public void iClickOnCheckBoxForTermsAndServiceAndClickOnContinue() {
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
    }

    @When("I click on CHECKOUT AS GUEST")
    public void iClickOnCHECKOUTASGUEST() {


    }
}

