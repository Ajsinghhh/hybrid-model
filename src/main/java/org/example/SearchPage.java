package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchPage extends Utils {

    public void searchItem(String searchText){
        typeIn(By.xpath("//input[@id='small-searchterms']"),searchText);
        //Click On Search Submit Button
        clickOnElement(By.xpath("//button[@type='submit']"));


        //Verify Nike Word Is Present In All Products On The Result Page
        List<WebElement> list = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        System.out.println(list.size());
        for (WebElement search : list) {
            String wordSearchBox = search.getText();
            Assert.assertTrue(wordSearchBox.contains(searchText), "Not Matched");
        }

    }

}
