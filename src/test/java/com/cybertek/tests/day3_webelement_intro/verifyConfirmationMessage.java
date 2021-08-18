package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailButton=driver.findElement(By.name("email"));
        emailButton.sendKeys("johnjeremy084@gmail.com");
        Thread.sleep(3000);

        String actualEmail=emailButton.getAttribute("value");
        String expectedEmail="johnjeremy084@gmail.com";

        if(actualEmail.equals(expectedEmail)){
            System.out.println("\"PASS\" = " + "PASS");
        }else{
            System.out.println("\"fail\" = " + "fail");
        }

        WebElement retrieveButton=driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        Thread.sleep(3000);

        String corfirmationMessage=driver.findElement(By.name("confirmation_message")).getText();
        if (corfirmationMessage.equals("Your e-mail's been sent!")){
            System.out.println("\"confirmed\" = " + "confirmed");
        }else{
            System.out.println("\"not confirmed\" = " + "not confirmed");
        }
        driver.quit();






    }
}
