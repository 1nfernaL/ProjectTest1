package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage{
	@FindBy(xpath="//li/a[@href and contains(text(),'Создать письмо')]")
	private WebElement createNewMessageButton;

	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement emailLogin;

	@FindBy(xpath = "//div[@class='row new'][1]/a")
	private WebElement openLastMessageLink;

     public String getLoginEmail() {
        return emailLogin.getText();
    }

    public void goToNewMessagePage() {

         createNewMessageButton.click();
    }

    public void openLastMessage() {
         openLastMessageLink.click();
    }
}
