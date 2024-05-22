package org.example;

import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {

    private By _clickOnCheckBox = By.id("termsofservice");
    private By _clickOnCheckoutButton = By.id("checkout");

    public void clickOnTermsOfServiceCheckBox() {

        //click the checkbox for terms and conditions
        //clickOnElement(By.id("termsofservice"));
        clickOnElement(_clickOnCheckBox);

        //click on continue button
        clickOnElement(_clickOnCheckoutButton);

    }


    }


