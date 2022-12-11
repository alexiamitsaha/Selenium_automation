package com.herokuapp.seleniumAutomationtest;


import java.util.concurrent.TimeUnit;
public class TestCase1 {
    public static void main(String[] args) {
        public WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("https://www.automationexercise.com/");

        //System.out.println("hello");

    }
}
