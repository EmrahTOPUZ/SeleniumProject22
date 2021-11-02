package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {


        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web Driver
        WebDriver driver = new ChromeDriver();

        //3- get the page
        driver.get("https://www.tesla.com");

        Thread.sleep(3000);

        // Going back using navigation
        driver.navigate().back();

        //going forward using navigation
        driver.navigate().back();
    }
}
