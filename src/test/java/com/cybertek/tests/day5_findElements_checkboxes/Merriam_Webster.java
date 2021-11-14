package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Merriam_Webster {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.merriam-webster.com");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("Total number of links in current page: " + listOfLinks.size());

        int linksWithNoText = 0;
        int linksWithText =  0;

        for (WebElement each : listOfLinks) {

            if (each.getText().isEmpty()){
                linksWithNoText++;
            }else{
                linksWithText++;
            }

            System.out.println(" Current page links with NO TEXT: " + linksWithNoText);

            System.out.println(" Current page links with text: " + linksWithText);

            listOfLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));



        }
    }

    /**
     *   What is xpath?
     *   - Xpath is one of the * Locator from Selenium library
     *   - XpathAllow us to create locatars using any given attribute and value
     *   - X path can move from parent to child, and child to parent
     *
     *   - How do we from parent to child?
     *   - To move from parent to direct child we use "/" at the end of the locator
     *
     *   - How do we move from child to parent?
     *   - To move from chils to direct parent we use "/.." at the end of the locator.
     *
     *   - How do we move from parent to any CHILD?
     *   - to move from parent to any child we use "//" at the end of the locator.
     *
     *   P.I.O
     *    - How many different types of Xpath are there and what are the differences?
     *
     *    1-) Absolute xpath:
     *        - Starts with single slash "/"
     *        - It means it starts with the root element "html"
     *        - We have to move from parent to child until we reach desired web element.
     *        - Therefore it is LONG and not dependable.
     *        - If one of the web elements used in this locator is removed, or any other web element is added,this locator wil break
     *        - Therefore absolute xpath is not suggested to use
     *    2-) Relative Xpath
     *
     *        - Starts with double slash "//"
     *        - "//" double slas means start from anywhere in the html
     *                    means jump to the point you will be given
     *        - Relative xpath is a lot more dependable compared to absolute xpath.
     *        - For relative xpath to break, the web element (or the attribute value) We locate directly has to change
     *
     *           //tagName[@attribute='value']
     *
     *        Common xpath locators
     *
     *        1-( //tagName[@attribute='value']
     *        2-( //tagName[.='text']
     *        3-( //tagName[text()='text']
     *        4-( //tagName[contains(@attribute,'value')]
     *        5-( //tagName[starts-with(@attribute,'value')]
     *
     *
     *   P.I.O
     *           How do you handle web elements that has dynamic attribute value?
     *
     *           <div id="sunny0998670897">
     *               <a href="http://www.google.com> GOOGLE</a>
     *               </div>
     *
     *   Using index numbers with xpath locator.
     *     - We surround the Locator with parenthesis and pass the index number of the web element we are trying to locate
     *     - If web elements are siblings to each other we don't have to use parenthesis
     *
     *   How do we verify if a checkbox or radio button is selected or not?
     *      -checkBox.isSelected();
     *      - This method will return "true" if given checkbox is selected
     *      - Wil return "false" if given checkbox is not selected
     */


}
