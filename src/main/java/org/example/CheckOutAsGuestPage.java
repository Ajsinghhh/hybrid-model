package org.example;

import org.openqa.selenium.By;

//Class Name
public class CheckOutAsGuestPage extends Utils {

    private By _clickOnCheckoutAsGuestButton = By.id("//button[normalize-space()='Checkout as Guest']");

    //Click on Checkout as guest
    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(By.xpath("//button[normalize-space()='Checkout as Guest']"));
    }

}
