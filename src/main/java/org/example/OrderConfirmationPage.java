package org.example;

import org.openqa.selenium.By;

public class OrderConfirmationPage extends Utils {


    public void confirmOrder() {

        //Popup message bypass

        //click on confirm button
        clickOnElement(By.xpath("//button[normalize-space()='Confirm']"));

    }
}
