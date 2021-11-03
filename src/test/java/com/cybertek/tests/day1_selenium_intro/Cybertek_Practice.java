package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cybertek_Practice {
    public static void main(String[] args) throws InterruptedException {

        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //Open Chrome driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");

        String expectedUrl = "cybertekschool";

        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("url Verification Passed");
        } else {
            System.out.println("url Verification failed");
        }

        String expectedTitle = "Practice";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");
        }

        Thread.sleep(3000);
        driver.close();


        /**
         *  What is Selenium?
         *  - Basically Selenium is a set of jar files that helps us automate browsers.
         *  - In simple terms it is basically some jar files.
         *  - We use these jar files to automate tests cases on web application
         *  What is Jar file?
         *  - Basically bunch of ready classes and methods
         *  What is Maven?
         *  - Maven is a build automation tool.
         *  - Maven helps us automate project creation and management.
         *  Is Maven for testers?
         *  - No! Therefore, we will not be using Maven to its full capacity.
         *  - But, as testers we are taking advantage of SOME of the functionalities of Maven
         *  When we create a project with maven following things happen
         *   1-) Project comes with existing folder structure
         *
         *       - src
         *          - main : developer writes the actual code here!
         *          - test : UNIT TEST goes here.
         *
         *   2-) pom.xml files is created.
         *
         *       -> pom.xml file is THE MOST important file in a Maven project
         *       -> we add and manage our dependencies in our pom.xml files
         *       -> We manage the versions of the dependencies in our project as well.
         *
         *   What version of which tool we are using?
         *
         *     -> JAVA - 8   Selenium - 3.141.59   WebDriverManager - 4.4.1
         *
         *   What is a build?
         *
         *     -> Build is a repeating steps in project creation and management
         *     -> Creating certain folder structure
         *     -> Compile code , easy to add jar files, dependencies, manage versions, deploy
         *
         *   If developer are using both main and test folders, where do SDET (testers) use?
         *      - Testers and developers are not working on the same project.
         *      - As SDET you will not have access to source code of application, unless you actually need to do something there.
         *
         *   What do we test as testers?
         *     -> Actual result vs Expected result ( in the web page)
         *     -> Broken software cannot be automated
         *     -> Before "thinking outside of the box " and getting creative we must verify actual vs expected
         *
         *   Where do we get our actual and expected data?
         *     -> Actual : We actual resault from the browser after doing testing.
         *
         *     -> Expected : Documantation A/C ( acceptence creteria), Requirements.
         *
         *
         */

    }
}
