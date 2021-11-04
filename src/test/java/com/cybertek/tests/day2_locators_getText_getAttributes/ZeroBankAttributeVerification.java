package com.cybertek.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankAttributeVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("Linktext verification is passed");
        }else {
            System.out.println("Linktext verification is failed");
        }

        String expectedHrefValue = "/index.html";

        String actualHrefValue = zeroBankLink.getAttribute("href");

        if (actualHrefValue.contains(expectedHrefValue)) {
            System.out.println("Href Attribute value verification passed!");
        } else {
            System.out.println("Href Attribute value verification failed!");
        }


    }
}
