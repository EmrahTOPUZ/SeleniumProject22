package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_IncorLogTitVerify {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");


        WebElement inputUsername = driver.findElement(By.name("email"));

        inputUsername.sendKeys("kjhiydk@gmial.com");

        WebElement inputPassword = driver.findElement(By.id("pass"));

        inputPassword.sendKeys("wertyyyy" + Keys.ENTER);


        String expectedTitle = "Log in to Facebook";

        Thread.sleep(2000);

        String actualTitle = driver.getTitle();


        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification is Passed");
        } else {
            System.out.println("Title verification is Failed");
        }

        driver.close();




    }
}
