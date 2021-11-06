package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelector_Cybertek {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //WebElement element = driver.findElement(By.cssSelector("a.nav-link"));

        WebElement forgotPassHeader = driver.findElement(By.tagName("h2"));

        WebElement emailLabel = driver.findElement(By.cssSelector("label[for='email']"));

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));

        WebElement retrievePassWordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPassHeader.isDisplayed() = " + forgotPassHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePassWordButton.isDisplayed() = " + retrievePassWordButton.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());



    }
}
