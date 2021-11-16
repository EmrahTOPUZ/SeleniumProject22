package com.cybertek.tests.day6_testNg_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {

    @Test (priority = 1)
    public void test1() {
        System.out.println("Running test1");

        String actual = "apple";
        String expected = "apples";

        Assert.assertEquals(actual,expected);
    }



    @Test
    public void setupClass() {
        System.out.println("Before class is running");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("After class is Running");
    }

    @BeforeMethod
    public void setupMethod() {
        System.out.println(" Before method is running");
    }

    @AfterMethod
    public void tearDownMethod () {
        System.out.println("After method is running");
    }



    @Test (priority = 2)
    public void test2() {
        System.out.println("Running test2");

        String actual = "Apple";
        String expected = "Apple";

        Assert.assertTrue(actual.equals(expected));
    }

}

/**
 *   TestNG
 *
 *     - What is TestNG?
 *      - TestNG is a unit testing framework.
 *
 *   Annotations
 *
 *     - Allow us to give change existing behaviour of method
 *
 *   1-) @Test
 *
 *     - If we create a java method, and use @Test annotations on top of it, this method will become an executable TestNG test
 *
 *   2-) @BeforeMethod
 *
 *     - Whichever methods is applied with @beforeMethod, will run before each test
 *     - It means , it will run as many times as the tests we have
 *     - usually  good for creating setups for browser and driver
 *
 *   3-) @AfterMethod
 *
 *     - Whichever method is applied with @BeforeMethod , will run once after each method
 *     - It means , it will run as many times as the tests we have
 *
 *   4-) @BeforeClass
 *
 *     - Will run ONCE before everything else
 *     - It will run only one time when the code is executed
 *
 *   5-)
 *
 *     - Will run Once after everything else
 *     - It will run only one time when the code is executed
 *
 *
 *     Except for @Test annotation, everything is ran by the annotations. Therefore it will be importantin what order we write them
 *
 *    For @Test
 *      - By default they are ran by alphabetic order
 *      - We can create priority in between each test, if we want to make test ran in specific order
 *      - Each test is INDEPENDENT of each other, unless we create dependencies
 *      - It means, if one fails , the other will be still excured
 *
 *    Priority
 *      - The smaller the priority number, the earlier test will be running
 *
 *   Assertions:
 *
 *    - Assertions in TestNg are static methods
 *    - We can pass boolena values , or multiple arguments depending on the type of assertion we are usig
 *    - On the line the assertion fails, it will stop executing in that test
 *
 *    assertEquals(arg1, arg2)
 *      - this assertion accept 2 argument of the same type
 *      - If arg
 *
 *      How to handle dropdowns Using Selenium?
 *
 *      - There are 2 types of dropdowns
 *
 *      1-) HTML DROPDOWN
 *        - If a dropdown is creates using anything other than <select> tag, it is called HTML
 *        - We handle just as any other web element
 *        - We locate, we click
 *
 *
 *      2-) SELECT DROPDOWN
 *
 *         - Select dropdowns are created using <select> tags, and the options are creates using<option> tag
 *
 *      How to handle Select dropdowns
 *
 *      1-) We locate the select dropdown
 *      2-) we create an object of "Select" from Selenium library
 *      3-) We pass the already located web element into the constructor of selected object
 *      4-) Using the object, we will be able to reach the methods coming from this
 *
 *      WebElement something = driver.findElement(By.Locator)
 *      Select select = new Select(something)
 *
 *
 *   - What is default selected
 *   - After selection, is it actually slected
 *   - how many options in the dropdowns
 *
 *   --> .getFirstSelectedOption();
 *     - This method will return the current;y slected option from the dropdown
 *     - Return type is webElement
 *
 *     select.getFirstSelectedOption();
 *
 *   -> .getOptions() ;
 *      - Return all of the options in the dropdowns
 *      - Return type List<webELement>
 *
 *   -> .getAllSelectedOption();
 *     - Returns all of the selected option as a List of WebElement
 *
 *     How to select from dropdowns?
 *
 *     There are 3 ways to select from dropdowns
 *
 *     1-) ByText
 *        -> select.selectByVisibleText("The text of the option")
 *        - This method accepts the text of the options as a String,  and select
 *
 *     2-) ByValue
 *        -> select.byValue("1");
 *        -> This method accept the value of the attribute "value" as string
 *        -> It will select the given option
 *
 *    3-) ByIndex
 *
 *        -> This method accepts the index number of the option as int
 *        -> Indexes from start from 0
 *
 *
 *
 */