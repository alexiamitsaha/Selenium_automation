package com.herokuapp.seleniumAutomationtest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NormalCodeTesting {
    public static void main(String[] args) {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("https://www.automationexercise.com/");

        //System.out.println("hello");

    }
}
