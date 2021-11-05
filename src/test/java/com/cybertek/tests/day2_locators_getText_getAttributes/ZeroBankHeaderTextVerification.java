package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderTextVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeader = "Log in to ZeroBank";

        WebElement actualHeader = driver.findElement(By.tagName("h3"));

        String actualHeaderText = actualHeader.getText();

        if (actualHeaderText.equals(expectedHeader)) {
            System.out.println("Header verification Passed");
        } else {
            System.out.println("Header verification Failed");
        }

        driver.close();
    }
}

/**
 *   What is Maven?
 *     -> Build automation tool for creating java projects
 *
 *   What is Build?
 *     -> Repeated steps we are following when we creating a java projects:
 *        - such as creating folder structure, compiling , deploying  etc
 *
 *   Is Maven for testers?
 *     -> No. But as SDET we will take advantage of some of its functionality.
 *
 *   Is maven the only "Build automation tool".?
 *     -> No there is gradle and Ant that i know,
 *
 *   .findElement();
 *
 *     -What does it do?
 *        -> Finds and returns a Single web element.
 *     - What does it accept as parameters?
 *        -> it accepts locators as String
 *     - What is the Return Type?
 *        -> Return type is the findElement is WebElement type that comes from Selenium library
 *     - What kind of exception does it throw?
 *        -> does it throw NoSuchElementException
 *          - When exception happens (unless it is handled) the code will not continue to execute.
 *
 *    P.I.O:
 *
 *       -> Can you tell me about the common exceptions you are facing when you are using JAVA+SElenium
 *
 *         - NoSuchElementException
 *
 *       -> When do you get NoSuchElementException?
 *          1-) most of the time the locator we are using is not correct!
 *          2-) Web element might not be loaded into the page yet. Inthis case we need to adjust the speed of the BrowserDriver's speed
 *              to the browser's speed.
 *              - For now we will be using Thread.sleep to stop our code execution for few seconds.
 *
 *    - .click();
 *      - clicks to the previous located web element.
 *      - it does not accept any argument.
 *      - No return type, just action method.
 *
 *    -.sendKeys("String to be sent");
 *      - it sends the given text as a String
 *      - It accepts a String as an argument
 *      - No return type, only action
 *      - this method cannot be used alone, We need to locate the web element to be able to use it.
 *
 *    - Keys.ENTER;
 *       -This piece of code can be passed in .sendKeys() method
 *       - It will press ENTER, as if user is pressing the ENTER key form keyboard
 *       - you can either use + or , to have Keys.ENTER in sendKeys.
 *
 *
 *  - LOCATORS:
 *
 *      - Locators are methods coming from Selenium library that allaws us to find WebElements and do action on them.
 *      - There is 8 locators in Selenium library.
 *
 *   #1-) id
 *        - It looks through the id attribute values and returns the matching webElement
 *        - id is a unique attribute value
 *        - It must be unique for each web element
 *        - sometimes it might have "dynamic"id attribute value
 *
 *  #2-) linkText:
 *        - linkText locator will find and return the link by its text
 *        - the text that is in between the opening tag and closing tag is used to locate web element
 *        - It only works with links
 *        - It will look for exact text match
 *
 *  #3-) partialLinkText
 *        - partialLinkText locator is very similar to linkText
 *        - This locator will only look for partial text match
 *        - we can compare this method to .contains() method in JAVA
 *
 *  #4-) name
 *        -this locator locates using name attribute's value
 *
 *  #5-) className
 *        - this locator locates using class attributes value to locate web Element
 *
 *  #6-) tagName
 *        - this locator uses tagName  to locate webElements
 *        - this is usally not very useful for locating SINGLE web elements
 *        - this locator is useful when you ae trying to locate multiple web elements
 *
 *   -> What happens with these 6 locators when there is multiple matching result?
 *       - It will find and return the first matching result
 *       - all of the action (sendKeys, click) will be applied to first web Element
 *       -in that situation , you can consider ti use a different locator
 *
 *   .getText();
 *      - What does it do?
 *       - Gets the text of given web element.
 *       - does not any arguments, return type is String.
 *       - .getText()  method can only get the text from in between the opening and closing tag
 *
 *   .getAttribute("value");
 *      - What does it do?
 *        This method will return the attribute value of given attribute on an already located web element,
 *         return type is String
 *
 *
 */
