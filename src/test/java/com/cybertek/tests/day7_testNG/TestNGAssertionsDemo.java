package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @BeforeMethod
    public void setUp(){
        System.out.println("open browser");
    }

    @Test
    public void test1() {
        Assert.assertEquals("title", "title");
        System.out.println("First Assertion");
    }

    @Test
    public void test2(){
        Assert.assertEquals("url","url");
        System.out.println("second assertion");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("close browser");

    }





}
