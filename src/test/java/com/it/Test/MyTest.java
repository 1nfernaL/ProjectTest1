package com.it.Test;

import com.it.App;
import com.it.Common.Constants;
import com.it.Pages.DashBoardPage;
import com.it.Pages.LoginPage;
import com.it.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest{
    @Test
    public void test() {
        app.login.loginValidUser();
        Assert.assertEquals(app.dashBoard.getLoginEmail(),validUser.getEmail());
        app.dashBoard.goToNewMessagePage();
        app.newMessage.sendMessage();
        Assert.assertEquals(app.sendStatus.getSuccessNotice(), Constants.successNotice);
        app.sendStatus.goToDashboardPage();
        app.dashBoard.openLastMessage();
        Assert.assertEquals(app.lastMessage.getFromWhom(),validUser.getEmail());
        Assert.assertEquals(app.lastMessage.getToWhom(),validUser.getEmail());
        Assert.assertEquals(app.lastMessage.getSubject(), Utils.Data.getRandomSubject());
        Assert.assertEquals(app.lastMessage.getTextArea(), Utils.Data.getRandomTextBody());
    }
}

