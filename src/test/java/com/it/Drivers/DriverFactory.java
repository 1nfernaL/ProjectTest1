package com.it.Drivers;

import com.it.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

import static com.it.Common.Constants.BASE_URL;

public class DriverFactory {
    static public WebDriver getDriver() {

        String property = System.getProperty("driver");
        WebDriver driver = null;
        if (property !=null) {
            if("opera".equals(property)){
                driver = new OperaDriver();

            }
            else{
                if ("chrome".equals(property))
                driver = new ChromeDriver();
            }
        } else {
            System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BASE_URL);
        return driver;
    }
}
