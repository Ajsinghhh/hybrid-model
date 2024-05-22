package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {

    LoadProp loadProp = new LoadProp();

    //Browser Name
    //String browser = "Chrome";
    String browser = loadProp.getProperty("browser");

    //Open Browser method And Type Url
    public void openBrowser() {

        if (browser.equalsIgnoreCase("Chrome")) {
            System.out.println("Your Browser is Chrome");
            //ChromeOptions options = new ChromeOptions();
            //options.addArguments("--incognito");
            //driver = new ChromeDriver(options);


            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefers = new HashMap<String, Object>();
            //passing parameter to disable save and autofill addresses and payment
            prefers.put("autofill.profile_enabled", false);
            options.setExperimentalOption("prefs", prefers);
            driver = new ChromeDriver(options);

        } else if (loadProp.getProperty("browser").equalsIgnoreCase("Edge")) {
            System.out.println("Your Browser is Edge");
            driver = new EdgeDriver();

        } else if (loadProp.getProperty("browser").equalsIgnoreCase("FireFox")) {
            System.out.println("Your Browser is FireFox");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Your Browser Name Is Wrong:" + loadProp.getProperty("browser"));
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

        //driver.get(loadProp.getProperty("browser"));
        driver.get(loadProp.getProperty("url"));

    }

    //Close Browser Method
    public void closeBrowser() {

         driver.quit();
    }
}
