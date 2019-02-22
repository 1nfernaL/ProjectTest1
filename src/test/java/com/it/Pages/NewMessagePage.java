package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMessagePage extends BasePage {
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement toWhom;

	@FindBy(xpath = "//input[@name='subject']")
	private WebElement subject;

	@FindBy(xpath = "//textarea[@name='body' and @id='text']")
	private WebElement textarea;

	@FindBy(xpath = "//input[@name='send' and @tabindex]")
	private WebElement sendButton;

    protected void sendMessage(String to, String theme, String body) {
        toWhom.sendKeys(to);
        subject.sendKeys(theme);
        textarea.sendKeys(body);
        sendButton.click();
    }
}
