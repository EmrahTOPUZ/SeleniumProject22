package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Title_Verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
                                                            //expected comes from document
        String actualTitle = driver.getTitle();

        String expectedTitle = "Facebook – log in or sign up";


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification is passed");
        } else {
            System.out.println("Verification is failed");
        }
    }
}
