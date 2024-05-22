package org.example;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//Class Name
public class Hooks extends Utils {

    //Object for BrowserManager class
    BrowserManager browserManager = new BrowserManager();

    //method for Open Browser
    @Before
    public void setUp() {
        browserManager.openBrowser();
    }

    //Method for Close Browser
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        browserManager.closeBrowser();

    }
}
