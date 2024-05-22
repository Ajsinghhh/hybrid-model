package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils{



    private By _register = By.className("ico-register");
    private By _RegisterSubmitButton = By.id("register-button");

    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();

    //Method For Registration
    public void enterRegistrationDetails() {

        //Click On Register Button
        //clickOnElement(By.className("ico-register"));
        clickOnElement(_register);

        //Type First Name
//       typeIn(By.id("FirstName"), "Aj");
        typeIn(By.id("FirstName"), loadProp.getProperty("firstName"));

        //Type Last Name
//        typeIn(By.id("LastName"), "lastName");
        typeIn(By.id("LastName"), loadProp.getProperty("lastName"));


        //Select Date From Date of Birth By Using Select By Visible Text
        //selectByVisibleText(By.name("DateOfBirthDay"), "6");
        selectByVisibleText(By.name("DateOfBirthDay"), loadProp.getProperty("dateOfBirthDay"));

        //Select Month From Date Of Birth By Using SelectByValue
        //selectByVisibleText(By.name("DateOfBirthMonth"), "October");
        selectByVisibleText(By.name("DateOfBirthMonth"), loadProp.getProperty("dateOfBirthMonth"));


        //Select Year From Date Of Birth By Using SelectByIndex
        //selectByVisibleText(By.name("DateOfBirthYear"), "1998");
        selectByVisibleText(By.name("DateOfBirthYear"), loadProp.getProperty("dateOfBirthYear"));

        //Type Email Address
        //typeIn(By.id("Email"), email);
        typeIn(By.id("Email"), loadProp.getProperty("email"));


        //Type Password
        // typeIn(By.id("Password"), password);
        typeIn(By.id("Password"), loadProp.getProperty("password"));


        //Confirm Password
        // typeIn(By.id("ConfirmPassword"), password);
        typeIn(By.id("ConfirmPassword"), loadProp.getProperty("confirmPassword"));

        //Click On Register Submit Button
        // clickOnElement(By.id("register-button"));
        clickOnElement(_RegisterSubmitButton);

    }
}
