package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelector_Cybertek {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement element = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement forgotPassHeader = driver.findElement(By.tagName("h2"));

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrievePassWordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassHeader.isDisplayed() = " + forgotPassHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePassWordButton.isDisplayed() = " + retrievePassWordButton.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());

    }
}
/**
 *   Xpath Locator
 *      - xpath is one of the 8 locator in Selenium.
 *      - xpath allows us to create custom locators using any given attribute and value.
 *      - We can also use the text of the web element create locator usinf xpath
 *
 *      - xpath syntax is different than cssSelector
 *
 *    There are 2 types of xpath
 *
 *    1-) Absolute XPATH
 *
 *      - Starts with single slash "/"
 *      - Start looking from the html tag and it goes 1 by1 until we reach the desired web Element
 *      - usually it is very long, and it is not dependable
 *      - because it is long, it is not stable, therefore it is not use much
 *      - it is not recommended using it as locator in our code
 *
 *      - With any minimal change in the Html code, this locator will be breaking, Therefore, not good practice to use Absolute xpath
 *
 *
 *    2-) Relative Xpath
 *
 *      - Starts with double slash "//"
 *      - "//" double slash means that you can start anywhere in the HTML page
 *      - Since we are allowed to start anywhere in the HTML page, relative xpath is very dependable and useful
 *      - The only time your relative XPAth supposed to be breaking is if ONLY the attribute value you use is changed
 *
 *        ex
 *            tagName[attribute='value']
 *
 *            //a[@href='https://www.tesla.com']
 *
 *            //a[@id='uh7']
 *
 *            //a[@name='bb95']
 *
 *         - We are not limited with id, name, class, or href attributes
 *         - We can use any custom attribute and their value with xpath locator.
 *
 *    COMMOMLY USED XPATH SYNTAXES
 *
 *      1-) //tagName[@attribute='value']
 *          -We are saying ,gget me the web element with given tagName, where attribute value is as provided
 *      2-) //tagName[contains(@attribute,'value']
 *          - Looks for the tagName that has matching or containing attribute value
 *      3-) //tagName[.='text']
 *          - this locator return the web element with given text
 *          - works in similar way to linkText locator. But linkText only works with links
 *          - Xpath will work with any web element
 *          - . -> stands for text in xpath
 *      4-)//*[@attribute='value']
 *          - * -> is used when we do not want to search by a tagName
 *          -If we want to be less specific, we pass * . and it will only match and return whatever attribute and value is provided.
 *          -
 *
 *
 *
 *
 *
 */