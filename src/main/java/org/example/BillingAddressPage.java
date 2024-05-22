package org.example;

import org.openqa.selenium.By;

public class BillingAddressPage extends Utils {

    private By _firstname = By.id("BillingNewAddress_FirstName");
    private By _lastname = By.id("BillingNewAddress_LastName");
    private By _email = By.id("BillingNewAddress_Email");

    private By _city = By.id("BillingNewAddress_City");

    private By _address1 = By.id("BillingNewAddress_Address1");

    private By _zipOrPostalCode = By.id("BillingNewAddress_ZipPostalCode");

    private By _phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterBillingAddressDetails() {


        //Type First Name
        //typeIn(By.id("BillingNewAddress_FirstName"),loadProp.getProperty("firstName"));
        typeIn((_firstname), loadProp.getProperty("firstName"));

        //Type Last Name
        //typeIn(By.id("BillingNewAddress_LastName"),loadProp.getProperty("lastName"));
        typeIn((_lastname), loadProp.getProperty("lastName"));

        //Type Email
        //typeIn(By.id("BillingNewAddress_Email"),loadProp.getProperty("email"));
        typeIn((_email),loadProp.getProperty("email"));

        // Click drop down for Country
        //selectByVisibleText(By.id("//[@id='BillingNewAddress_CountryId']");
        clickOnElement(By.id("BillingNewAddress_CountryId"));

        //Select Country
        selectByVisibleText(By.id("BillingNewAddress_CountryId"),loadProp.getProperty("country"));

        //Type City
        //typeIn(By.id("BillingNewAddress_City"),loadProp.getProperty("city"));
        typeIn((_city),loadProp.getProperty("city"));

        //Type Address
        //typeIn(By.id("BillingNewAddress_Address1"),loadProp.getProperty("address1"));
        typeIn(_address1,loadProp.getProperty("address1"));

        //Type PostCode
        //typeIn(By.id("BillingNewAddress_ZipPostalCode"),loadProp.getProperty("zip/postalCode"));
        typeIn(_zipOrPostalCode,loadProp.getProperty("zipOrPostalCode"));

        //Type Phone number
        //typeIn(By.id("BillingNewAddress_PhoneNumber"),loadProp.getProperty("phoneNumber"));
        typeIn(_phoneNumber,loadProp.getProperty("phoneNumber"));

        //Click on Continue button
        clickOnElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']"));

        clickOnElement(By.id("shippingoption_1"));


    }
}
