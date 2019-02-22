package com.it.Pages;

import com.it.Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected static WebDriver driver= DriverFactory.getDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
