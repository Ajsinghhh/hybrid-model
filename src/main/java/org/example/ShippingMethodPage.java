package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils{

    public void shippingMethod(){

        //click on radio button Next Day Air($0.00)
        clickOnElement(By.xpath(" //input[@id='shippingoption_1']"));

        //Click on Continue Button
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));

    }
}
