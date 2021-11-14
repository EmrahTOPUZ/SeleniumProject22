package com.cybertek.tests.day6_testNg_intro_dropdowns;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Intro {

    @BeforeMethod
    public void setupMethod() {
        System.out.println(" Before method is running");
    }

    @Test
    public void test1() {
        System.out.println("Running test1");
    }

    @Test
    public void test2() {
        System.out.println("Running test2");
    }

}

/**
 *   TestNG
 *
 *     - What is TestNG?
 *      - TestNG is a unit testing framework.
 */