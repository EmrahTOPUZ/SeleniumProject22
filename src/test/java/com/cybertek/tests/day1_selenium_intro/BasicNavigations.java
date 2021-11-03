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
    }
}
