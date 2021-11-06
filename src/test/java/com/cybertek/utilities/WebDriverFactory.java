package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** New method creation
 method name : getDriver
 Static method
 Accept String arg: browserType
    - This arg will determine what type of browser is opened
    - if "chrome" passed --> it will open chrome browser
    - if "firefox" passed -> it will open firefox browser
 Return Type is : "WebDriver"

 //static method we dont have to create an object
 */

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {

        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {

            return new FirefoxDriver();

        } else {
            System.out.println("Given browser type does not exist. Driver = null");
            return null;
        }


    }

}

/**
 * WebDriverFactory
 *   - Advantages of creating utility methods
 *      - Good for repeating actions, create once, use repeatedly as needed
 *      - Easy to maintain your code with utility method
 */
