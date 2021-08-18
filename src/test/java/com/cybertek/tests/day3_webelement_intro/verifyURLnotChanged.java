package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {
    public static void main(String[] args) {
        /*verify URL not changed
        -open chrome browser
        -go to http://practice.cybertekschool.com/forgot_password Links to an external
        -click on Retrieve password
        -verify that url did not change
         */
        // open chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedUrl=driver.getCurrentUrl();

        WebElement retrievePasswordButton =driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
      // driver.quit();




    }
}
