package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    WebDriver driver;


    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void test1_simple_dropdowns_test() {

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentlyOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";

        Assert.assertTrue(actualTextOfCurrentlyOption.equals(expectedText));

        //Doing everything in one line
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(), "Please select an option");


        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropdownText = "Select a State";

        Assert.assertEquals(actualStateDropdownText, expectedStateDropdownText);

    }


    @Test
    public void test2_state_dropdown_test(){


        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        stateDropdown.selectByVisibleText("Illinois");

        stateDropdown.selectByValue("VA");

        stateDropdown.selectByVisibleText("California");

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText ,expectedOptionText);

//2;22
    }

    @Test
    public void test3_date_dropdown_verification() {

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yearDropdown.selectByVisibleText("1922");

        monthDropdown.selectByValue("11");

        dayDropdown.selectByIndex(0);

        String expectedYear = "1922";
        String actualYear = yearDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualYear, expectedYear);

        String expectedMonth = "December";
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualMonth, expectedMonth);

        String expectedDay = "1";
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDay, expectedDay);
    }

    @Test
    public void test4_multiple_select_dropdown() throws InterruptedException {

        Select multipleDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> allOptions = multipleDropdown.getOptions();

        for (WebElement each : allOptions) {

            Thread.sleep(500);
            each.click();

            //4. Print out all selected values.
            System.out.println("Selected: " + each.getText());

            //Verifying each option is selected:
            Assert.assertTrue(each.isSelected(), "The option "+each.getText()+" is not selected!");

            multipleDropdown.deselectAll();

            for (WebElement each1 : allOptions) {

                Assert.assertFalse(each.isSelected());
            }
        }

    }

    @Test
    public void test5_non_select_dropdown() throws InterruptedException {

        WebElement websiteDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));

        Thread.sleep(2000);
        websiteDropdown.click();



        Thread.sleep(2000);
        WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));

        facebookLink.click();

        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
    }


    @AfterClass
    public void tearDownClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}

/**
 *   What is TestNG?
 *     - TestNG is a Unit Testing framework.
 *     - It has nothing to do with selenium.
 *
 *   Is this tool created for testers?
 *
 *      - No. It is for developers to create unit testing structure.
 *
 *   Is TestNG hte only unit testing framework?
 *
 *      - No there is JUnit ,
 *
 *   What is the most important thing we will be using from TestNG?
 *
 *     - Mostly we use Annotations.
 *
 *   What annotations does?
 *     - The primary goal of annotation is to change behavior of existing method.
 *     - If we apply a TestNG annotation to a simple java method, it will become TestNG property.
 *     - It means it will not be only java method anymore.
 *     - It will be acting the way TestNG intends.
 *
 *     - Common annotations
 *
 *      - @Test
 *      - BeforeMethod, AfterMethod
 *      - BeforeClass, AfterClass
 *      - BeforeTest , AfterTest
 *      - BeforeSuite, AfterSuite
 *
 *
 *     @Test
 *     public void test1() {
 *         sout("Test1 is running.")
 *     }
 *
 *     @Test:
 *
 *       This will make the java mehtod a TestNg test.
 *       Every test is independent of each other (by default).
 *       if one test fails, it will not effect the other tests(by default)
 *       But we can create dependency in between tests. (using"dependency"
 *
 *       What is the running order of TestNG tests?
 *        - By default tests will run in alphabetic order
 *        - But, this is not a good practice to have.
 *        - We can prioritize tests order using "priority" keyword
 *        - The smaller the number, the earlier the test will run
 *
 *    @BeforeMethod,AfterMethod annotations
 *
 *    What does it do?
 *     - These annotations will make the method run once before (or after) each @Test
 *
 *    What is it used for?
 *     - Can be used ofr setup or teardown steps.
 *
 *   -@BeforeClass, AfterClass
 *
 *    What does it do?
 *      -Regardless of howevermany test we have, these will only run ONCE before(or After) everything in the class
 *
 *    What is it used for?
 *
 *      -Can be used for setup or teardown steps.
 *
 *   Assertions:
 *
 *     -What does assertions do?
 *       - Assertions verify expected and actual values.
 *       - It can be string, int List<String> List<WebElement>
 *       - Assertions will determine if a test passes or fails
 *       - This result (pass or Fail) will be reflected in the test reports
 *
 *       - If an assertion fails, the rest of the lines after that assertion in the same test will Not be executed
 *
 *       We have many assertions doing similar verifications
 *          -assertTrue()
 *              - This will accept a statement that is returning a boolean value
 *              - This will expect a "true" to pass the test
 *              - so if the result of the statement is false, this  will fail the test
 *
 *          - assertEqual()
 *              - accept 2 arguments snd the  arguments need to be same data type
 *              - compares, and passes if the arguments are equal to each other.
 *              - We can pass string vs string
 *              - We can pass int vs int
 *              - We can pass List vs List
 *
 *     -------------------------------------------------------
 *
 *      How to handle dropdown using Selenium?
 *
 *      How many types of dropdowns are there?
 *        - 2 types of dropdowns.
 *
 *     1-) HTML dropdowns
 *
 *       - If a dropdown is created not using <select> tag, we handle it just as any other web element
 *       - Meaning we locate ad we click
 *
 *     2-) Select dropdowns
 *       - Select dropdowns are created using <slect> tag
 *
 *     How to handle select dropdowns?
 *       - We locate select dropdown using findELement method
 *       - We create object of select class
 *       - Pass the dropdown located inside of the SELECT constructor
 *       - Then we can use the select object to reach special methods for the dropdowns
 *
 *
 *         If we create web element in a different line
 *
 *          WebElement dropdown = driver.findElement(By.Locator);
 *
 *          Select select = new Select(dropdown);
 *
 *          Select dropdown1 - new SelectDriver.findElement(Locator);
 *
 *   How do we select from a <select> dropdown?
 *       - How many ways are there?
 *
 *
 *      1-By text of the option
 *        - this method accepts the text of the option we want to select
 *
 *      2- By indexnumber of the option
 *        - We count index numbers and pass the index of the option
 *
 *      3- By value of the option
 *        - This method allows user to select an option by the value of the attribute "value"
 *
 *        select.selectByValue("1");
 *
 *
 *    How do we verify the currently selected option?
 *      -getFirstSelectedoption()
 *      - This methid will get the currently selected option
 *      - So this can be used for the default value as well
 *
 *      - Return type:  WebElement
 *      - It will find and return the current option as a web element
 *
 *    How to get all off the option from dropdown?
 *
 *      -.getOptions()
 *      - this method will return all of the options from the given dropdown
 *
 *      - What is the return type of this method?
 *      - List of WebElements
 *
 */
