package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com");

        //getting title with selenium

        String title = driver.getTitle();
        System.out.println("title is :"+title);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("URL="+currentUrl);

        String pageSource = driver.getPageSource();
        System.out.println("pagesourse="+pageSource);




    }
}
