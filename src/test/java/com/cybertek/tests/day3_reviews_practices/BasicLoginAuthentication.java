package com.cybertek.tests.day3_reviews_practices;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicLoginAuthentication {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification passed");
        } else {
            System.out.println("Verification failed");
        }

        WebElement usernameInput = driver.findElement(By.id("ctl00_MainContent_username"));

        usernameInput.sendKeys("Tester");

        WebElement passwordInput = driver.findElement(By.id("ctl00_MainContent_password"));

        passwordInput.sendKeys("test" + Keys.ENTER);

        //WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        //loginButton.click();

        String expectedHomePage = "Web Orders";
        String actualHomePage = driver.getTitle();



        if (actualHomePage.equals(expectedHomePage)) {
            System.out.println("Verification of home page passed");
        } else {
            System.out.println("Verification of home page failed");
        }

    }
}
/**
 *   cssSelector (Locator):
 *
 *        -> cssSelector is one of the 8 locator in Selenium
 *        -> Using cssSelector you will be able to locate web elements with any of the attributes provided inside of the tag.
 *        -> we are not just limited to name, class, or id attributes anymore
 *        -> we can use any attribute inside of the tag
 *
 *        There are 2 different syntaxes in cssSelector
 *
 *        ex
 *           - <a href="https://ww.tesla.com" id="uh7" name="bb96" > Tesla </a>
 *
 *            1-) locate above link with cssSelector using id
 *
 *                 a[id='uh7']
 *
 *            2-) locate above link with cssSelector using name
 *
 *                 a[name='bb96']
 *
 *            3-) locate above link with cssSelector using href
 *
 *                 a[href='https://ww.tesla.com']
 *
 *         ex2:
 *
 *          -Second syntax is limited to use with "id" and "class"  only
 *
 *             a
 *
  */
