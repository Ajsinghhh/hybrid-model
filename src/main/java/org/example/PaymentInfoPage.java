package org.example;

import org.openqa.selenium.By;

public class PaymentInfoPage extends Utils {

    public void enterPaymentDetails(){
        //Type cardholder's name
        typeIn(By.xpath("//input[@id='CardholderName']"),loadProp.getProperty("cardholderName"));

        //type card number
        typeIn(By.xpath("//input[@id='CardNumber']"),loadProp.getProperty("cardNumber"));


        //select year from the dropdown
        clickOnElement(By.id("ExpireYear"));
        selectByVisibleText(By.id("ExpireYear"),loadProp.getProperty("expirationYear"));

        //type card code
        typeIn(By.xpath("//input[@id='CardCode']"),loadProp.getProperty("cardCode"));

        //Click on continue button
        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
    }

}
