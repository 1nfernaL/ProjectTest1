package com.it.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LastMessagePage extends BasePage {
	@FindBy(xpath = "//div[@class='field_value']/a")
	private WebElement fromWhom;

	@FindBy(xpath = "//div[@class='to']/div[@class='field_value']")
	private WebElement toWhom;

	@FindBy(xpath = "//div[@class='message_header clear']/h3")
	private WebElement subject;

	@FindBy(xpath = "//div[@class='message_body']/pre")
	private WebElement textArea;

    public String getFromWhom() {
        return fromWhom.getText();
    }

    public String getToWhom() {
        return toWhom.getText();
    }

    public String getSubject() {
        return subject.getText();
    }

    public String getTextArea() {
        return textArea.getText();
    }
}
