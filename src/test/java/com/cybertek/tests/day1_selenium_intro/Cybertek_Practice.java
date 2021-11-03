package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com");

        String expectedUrl = "cybertekschool";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification failed");
        }

        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification Passed");
        } else {
            System.out.println("Verification Failed");
        }

        Thread.sleep(3000);

        driver.close();

    }
}
