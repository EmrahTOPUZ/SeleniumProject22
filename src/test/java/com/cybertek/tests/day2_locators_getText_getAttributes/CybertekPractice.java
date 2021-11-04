package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/inputs");

        Thread.sleep(2000);

        driver.findElement(By.className("nav-link")).click();

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

        driver.close();

    }
}

/**
 *  #6- ) tagName :
 *         -> tagName is one of the 8 locators of Selenium
 *         -> tagName is locating web elements using their tag names
 *
 *   ------------------------------------------------------------------
 *
 *   .getText();
 *
 *       -> .getText() method gets the text of the given web element.
 *       -> .getText() method is only able to return the text that is in between the OPENING TAG and CLOSING TAG
 *       -> This method DOES NOT accept any Arguments
 *       -> return typee is String
 *
 *   .getAttribute
 *
 *       -> .getAttribute method will get the given attribute value
 *       -> this method is only able to read inside of the <openingTag>
 *       -> it will find the mathching attribute name , and return the value
 *       -> return type: String
 *
 *
 *
 */
