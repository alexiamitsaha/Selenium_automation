package com.herokuapp.seleniumAutomationtest.configuretion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TheInternet extends BasePage {

    public TheInternet(WebDriver driver) {
        super(driver);
    }
    //Header1
    @FindBy(xpath = "//div[@id='content']/h1[@class='heading']")
    public WebElement header1;

    public WebElement getHeader1() {
        return header1;
    }
    //Header2
    @FindBy(xpath = "//div[@id='content']/h2[.='Available Examples']")
    public WebElement header2;
    public WebElement getHeader2(){
        return header2;
    }

    // AbTesting
    @FindBy(css="[href='\\/abtest']")
    public WebElement abTesting;
    public WebElement getAbTesting(){
        return abTesting;

    }
}
