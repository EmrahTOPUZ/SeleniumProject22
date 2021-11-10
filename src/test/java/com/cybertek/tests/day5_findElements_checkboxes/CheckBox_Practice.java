package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class CheckBox_Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox']) [1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox']) [2]"));

        if (!checkBox1.isSelected()) {
            System.out.println("Checkbox 1 is not selected verification is passed");
        } else {
            System.out.println("Checkbox 1 is not selected verification is failed");
        }

        if (checkBox2.isSelected()) {
            System.out.println("Checkbox 2 is not selected verification is passed");
        } else {
            System.out.println("Checkbox 2 is not selected verification is failed");
        }

        Thread.sleep(3000);
        checkBox1.click();


        Thread.sleep(3000);
        checkBox2.click();


        if (checkBox1.isSelected()) {
            System.out.println("Checkbox 1 is not selected verification is passed");
        } else {
            System.out.println("Checkbox 1 is not selected verification is failed");
        }

        if (!checkBox2.isSelected()) {
            System.out.println("Checkbox 2 is not selected verification is passed");
        } else {
            System.out.println("Checkbox 2 is not selected verification is failed");
        }



        }
}
