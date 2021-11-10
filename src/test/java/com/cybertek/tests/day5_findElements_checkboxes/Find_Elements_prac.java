package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Find_Elements_prac {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //if a web elements is not found, this will wait UP TO given seconds
        //if web element is located before 15 seconds, it will move on
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");


        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));
        for (WebElement each  : listOfLinks) {
            System.out.println( each.getText());
            System.out.println(each.getAttribute("href"));
        }

        int numberOfLinks = listOfLinks.size();

        System.out.println("number Of 3eLinks = " + numberOfLinks);





    }
}

/**
 *   XPATH:
 *
 *    - 1 of the 8 locators in Selenium
 *    - Using xpath we can create custom locators
 *    - We can use Any attribute and value provided using xpath
 *    - We can move from parent to child or child to parent using xpath locator
 *
 *    How many types of xpath locator we have?
 *      - There are 2 types of xpath locators.
 *
 *      1-) ABSOLUTE XPATH
 *
 *         - Absolute Xpath Starts with "/"
 *         - We have to start from the root element, meaning "html" tag
 *         - And we go down 1 by 1 to the desired element
 *         - It is not stable. If there is any minimal change happen in the html structure, our locator will break
 *         - It is not recommended to use
 *
 *      2-) RELATIVE XPATH
 *
 *         - relative xpath starts with double slash
 *         - "//" double slash mean we can start anywhere in the html page
 *         - We can use any attribute and value to be more specific on which web elemetn we want
 *         - Relative xpath is more reliable because we are being very specific with that we want
 *         - We have multiple syntaxes for relative xpath
 *
 *        //tagName[@attribute='value']
 *
 *        //toyota[@color='red']
 *
 *        //toyota[@vin='kagfbkwBFKsjf']
 *        =================================
 *
 *         //tag[.='text']
 *         //tag[contains9@attribute,'value'] = this syntax locates using part of the given atribute
 *
 *        - it does not look for exact match
 *
 *     How do we go from parent to child using xpath
 *
 *         - Using "/" we can go from parent to child
 *
 *         //div[@id='content;]/div/h3   child tagName
 *
 *     HOW TO GO FROM CHILD TO PARENT FROM XPATH
 *
 *       - Using "/.." we will go from child to parent
 *
 *       //tagNAme[@attribute='value']
 *
 *        //h2[.='Forgot Password']/..
 *
 *
 */