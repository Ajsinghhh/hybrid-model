package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {

    private By _registerButton = By.linkText("Register");
    private By _addToCartButton = (By.xpath("//div[@id='main']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]"));

    private By _shoppingcartbutton = By.xpath("//span[@class='cart-label']");


    public void clickOnAddToCartButtonForHTCOneM8AndroidL50Lollipop() {

        //Click On Add to cart button for HTC One M8 Android L 5.0 Lollipop
        //ClickOnElement(By.xpath("//div[@id='main']//div[3]//div[1]//div[2]//div[3]//div[2]//button[1]"));
        clickOnElement(_addToCartButton);
    }

    public void clickOnShoppingCartButton() {

        //Click on shopping cart button
        //ClickOnElement(By.className("cart-label"));
        clickOnElement(_shoppingcartbutton);

    }

    public void clickOnRegisterButton() {

        clickOnElement(_registerButton);
    }


    public void clickOnGivenButton(String buttonName) {
        clickOnElement(By.xpath("//a[.='" + buttonName + " ']"));

    }

    public void clickOnCurrencyDropDown() {
        clickOnElement(By.id("customerCurrency"));
    }

    public void selectCurrency() {
        selectByVisibleText(By.id("customerCurrency"), loadProp.getProperty("currency"));
    }

    public void verifyAssertForDollarAndEuro() {
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='prices']/span"));
        for (WebElement symbol : list) {
            String priceSymbol = symbol.getText();
            if (loadProp.getProperty("currency").equals("US Dollar")) {
                Assert.assertTrue(priceSymbol.contains("$"), "Not Matched");

            } else {
                Assert.assertTrue(priceSymbol.contains("€"), "Not Matched");
            }
        }
    }

    public void clickOnSearchBar() {
        clickOnElement(By.xpath("//input[@id='small-searchterms']"));
    }

    public void typeAnyTextInTheSearchBar(String searchText) {
        typeIn(By.xpath("//input[@id='small-searchterms']"), searchText);
    }

    public void clickOnSearchSubmitButton() {
        clickOnElement(By.xpath("//button[@type='submit']"));
    }

    public void verifySearchItem(String searchText) {
        List<WebElement> list = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        System.out.println(list.size());
        for (WebElement text : list) {
            String wordNike = text.getText();
            Assert.assertTrue(wordNike.contains(searchText), "Not Matched");

        }
    }

    public void clickOnLoginButton() {

        clickOnElement(By.className("ico-login"));
    }

}
