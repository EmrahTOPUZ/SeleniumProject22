package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoginAuthentication {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
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

        passwordInput.sendKeys("test");
        passwordInput.sendKeys(Keys.ENTER);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification passed");
        } else {
            System.out.println("Verification failed");
        }



    }
}
