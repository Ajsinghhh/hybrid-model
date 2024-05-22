package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends  Utils {

    public void creditCard(){

        //click on radio button credit card
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));

        //click on continue button
        clickOnElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));

    }
}
