package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpath_MultipleButtons {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedText = "Clicked on button one!";
        String actualText = resultText.getText();

        if (actualText.equals(expectedText)) {
            System.out.println("Verification is Passed");
        }else {
            System.out.println("Verification is failed");
        }


    }
}
