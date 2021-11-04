package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppleSearchVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);


        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification is Passed");
        } else {
            System.out.println("Title verification is Failed");
        }

        driver.close();
    }
}


/**
 *     #4-) id
 *             -> id is one of the * locators of Selenium
 *             -> Very similar to "name" locator.
 *             -> id is unique to each web element
 *             -> sometimes id can be dynamic.
 *             -> dynamic means, everytime you refresh the page, either part of the id attribute value or all of it might change
 *
 *
 */
