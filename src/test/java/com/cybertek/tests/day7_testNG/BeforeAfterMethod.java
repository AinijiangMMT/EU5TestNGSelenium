package com.cybertek.tests.day7_testNG;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.annotations.*;

public class BeforeAfterMethod {

    @BeforeClass
    public void setUpClass(){
        System.out.println("--BEFORE CLASS--");
        System.out.println("executed one time before the class");
    }

    @Test
    public void test1(){
        System.out.println("first test case");
    }

    @Ignore
    @Test
    public void test2(){
        System.out.println("2nd test case ");
    }

    @Test
    public void test3(){
        System.out.println("3rd test case");
    }


    @BeforeMethod
    public void setUp(){
        System.out.println("Web driver opens browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("closing browser, quiting");
    }
@AfterClass
    public void tearDownClass(){
    System.out.println("--AFTER CLASS--");
    System.out.println("some reporting code here");
}


}
