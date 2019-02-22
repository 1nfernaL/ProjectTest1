package com.it.Steps;

import com.it.Pages.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonSteps extends BasePage {
    public void stopApp() {
        driver.quit();
    }

}
