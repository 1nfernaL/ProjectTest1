package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessSendStatusPage extends BasePage{
	@FindBy(xpath = "//div[@class='content clear' and contains(text(),'Письмо успешно отправлено адресатам')]")
	private WebElement successNotice;

	@FindBy(xpath = "//li/a[@href and contains(text(),'Письма')]")
	private WebElement allMessagesButton;


    public String getSuccessNotice() {
        return successNotice.getText();
    }
    public void goToDashboardPage() {
        allMessagesButton.click();
    }
}
