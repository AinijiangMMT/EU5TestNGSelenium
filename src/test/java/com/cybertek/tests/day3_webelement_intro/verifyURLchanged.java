package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailButton=driver.findElement(By.name("email"));

        emailButton.sendKeys("johnjeremy084@gmail.com");

        WebElement retrieveButton=driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        String actualUrl=driver.getCurrentUrl();
        if(actualUrl.equals(expectedUrl)){
            System.out.println("\"PASS\" = " + "PASS");
        }else{
            System.out.println("\"FAIL\" = " + "FAIL");
            System.out.println("expected URL="+expectedUrl);
            System.out.println("actual URL="+actualUrl);
        }
        driver.quit();
    }
}
