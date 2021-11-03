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

        System.out.println("Current title " + driver.getTitle());


        String currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        Thread.sleep(3000);

        // Going back using navigation
        driver.navigate().back();

        Thread.sleep(3000);

        //going forward using navigation
        driver.navigate().forward();

        // putting 3 second of wait stops the code for 3 seconds
        Thread.sleep(3000);


        driver.navigate().refresh();

        driver.navigate().to("https://google.com");

        System.out.println("Current title " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        // this line will maximize the browser page
        driver.manage().window().maximize();

        //Will not work for windows, only for mac users
        //driver.manage().window().fullscreen();

        driver.close();
        //will close the currently opened browser

        driver.quit();
        //will close sll of the opened browsers or tabs within the same

        //pkill -9 Google Chrome
        // Terminal comment to close all the opened Google Chrome browsers
        // command + space will open spotlight search on macbook
    }

}
