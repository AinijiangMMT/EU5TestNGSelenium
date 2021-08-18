package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        WebElement fullNameInput=driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        WebElement emailButton=driver.findElement(By.name("email"));
        emailButton.sendKeys("johnjeremy084@gmail.com");

        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();




    }
}
