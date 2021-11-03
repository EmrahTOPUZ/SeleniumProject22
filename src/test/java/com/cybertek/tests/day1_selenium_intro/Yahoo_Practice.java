package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {

    public static void main(String[] args) {

        //setup browser driver
        WebDriverManager.chromedriver().setup();

        //1- Open chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        //expected title , we usually get our expected value from documentation
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        //actual value
        String actualTitle = driver.getTitle();
        //System.out.println("actualTitle = " + actualTitle);

        //creating our verification
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification Passed");
        } else {
            System.out.println("Title is not expected.Verification Failed");
        }

        //closing the browser
        driver.close();

        /**
         * Selenium WebDriver is actually the name of the tool
         * - Collection of libraries
         * Browser Driver does not come in the Selenium library
         *  - we need to set it up separately
         *  - if we are using WebDriverManager (BoniGarcia) easily sets up our driver
         *  - if we are not using WebDriverManager, we have to download our browser drivers separately
         */

    }
}
