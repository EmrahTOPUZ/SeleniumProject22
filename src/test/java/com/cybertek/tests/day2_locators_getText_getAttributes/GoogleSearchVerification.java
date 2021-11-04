package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchVerification {

    public static void main(String[] args) {


        //Open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Go to google.com
        driver.get("https://google.com");

        // locate the web element and ----click
        driver.findElement(By.linkText("Gmail")).click();

                                                                    // COMMAND + D multiplies the current line
        String expectedInTitle = "Gmail";                           // command + shift up/down moves the line
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification Failed");
        }


        driver.navigate().back();

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)) {
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");
        }

    }
}

/**
 *   To be able to click(or do any action) to any link:
 *    1 -> We need to find the web element
 *    2 -> Locate it
 *    3 -> apply action ( click or send input) with Selenium
 *
 *    ex:
 *
 *        .findElement(By.Locator);
 *         -This method will find and return A SINGLE web element
 *         -It accepts a locator parameter to locate web elements
 *
 *   What are the locators in Selenium?     (Control + shift + C) will help while looking for webElment on inspect page
 *
 *       - Locator helps us locate web elements using SELENIUM WEBDRIVER
 *       - There are 8 locators in Selenium
 *
 *   #1- ) linkText("The text of the link") ;
 *        -> linkText locator will look through all of the links text on the page, and will return the link with matching text
 *        -> This locator will ONLY work on links.
 *        How do we know if it is a link or not?
 *          - we inspect and see if it is a anchor tag <a>
 *        -> We must pass the text of the link inside of the locator
 *        -> This method will be looking for exact match of the text
 *
 *  #2- ) partialLinkText :
 *        -> partialLinkText locator will be looking for PARTIAL TEXT MATCH.
 *        -> THis is similar to .contains method in Java
 *
 *      ex:
 *          <a href="https://something.com">Click here to go to somewhere </a>
 *
 *  #3- ) name:
 *
 *          -> name is one of the 8 locators in Selenium.
 *          -> Looks through the html code, and returns the matching "name" attributes value
 *      ex:
 *          <a href="https://something.com" name="ubt7" >Click here to go to somewhere </a>
 *
 *     HOW TO WRITE SOMETHING USING SELENIUM?
 *
 *       -> .sendKeys("String");
 *
 *           - Sends the given argument as a String.
 *
 *
 */
