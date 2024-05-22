package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//Class Name
public class CheckoutCompletedPage extends Utils {

    //expected message
    static String expectedMessage = "ORDER NUMBER";

    public void verifyOrderSuccessMessageDisplayed(){


        //Verify Message Your order has been successfully processed!
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='section order-completed']/div/strong")),loadProp.getProperty("orderConfirmationMessage"));
        System.out.println("Your order has been successfully processed");

        //Verify Message ORDER NUMBER:
        Assert.assertTrue(getTextFromElement(By.xpath("//div[@class='order-number']/strong")).contains(expectedMessage));
        System.out.println("Order Number");

        //Verify that you are logged in as a guest
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='ico-login']")).isDisplayed(),"login text not displayed");

    }

}
