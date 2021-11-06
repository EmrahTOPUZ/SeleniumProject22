package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_Selector_AmazonTask {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        amazonSearchBar.sendKeys("Wooden spoon" + Keys.ENTER);

        String expectedTitle = "Amazon.com : Wooden spoon";
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title after search = " + actualTitle);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification failed");
        }

        driver.close();

    }
}

/**
 *    .isDisplayed();
 *     - What this method do?
 *           -> It will verify if the methid on the page is displayed or not.
 *     - What is the return type?
 *           -> boolean : true/false
 *           - If the web element is displayed on the page it will return : true
 *           - If the web element is NOT displayed on the page it will return : false
 *           - It does not accept any arguments
 *           - you need to use this method on an already located web element.
 */
