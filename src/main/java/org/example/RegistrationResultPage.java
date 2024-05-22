package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils {


    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();
    //Verify Message displayed for successfully registration

    //Method For Successful Registration
    public void verifyUserRegisteredSuccessfully() {
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), loadProp.getProperty("expectedRegistrationMsg"), "Your registration completed");

        //Click On Continue Button On THe Registration Result Page
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));

        //driver.get(loadProp.getProperty("expectedRegistrationMsg"));
    }
}
