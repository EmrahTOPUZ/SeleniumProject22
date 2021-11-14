package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Apple_Practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://www.apple.com");

        List<WebElement> boxesLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLinks = 1; eachLinks < boxesLinks.size()-1 ; eachLinks++) {
           // System.out.println(boxesLinks.get(eachLinks).getText());

            boxesLinks.get(eachLinks).click();

            boxesLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

            System.out.println("Current title in the page - " + driver.getTitle());

            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

            System.out.println("Number of links in the current page - " + allLinks.size());

            int linksWithNoText = 0;
            int linksWithText = 0;

            for (WebElement each : allLinks) {
                if (each.getText().isEmpty()) {
                    linksWithNoText++;

                }else {
                    linksWithText++;
                }

            }

            System.out.println("Current page links with no text: " + linksWithNoText);

            System.out.println("Current page links with  text: " + linksWithText);

        }
    }
}
