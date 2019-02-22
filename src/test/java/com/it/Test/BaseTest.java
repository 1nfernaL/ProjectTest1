package com.it.Test;

import com.it.App;
import com.it.Users.User;
import com.it.Users.UserFactory;
import org.testng.annotations.AfterMethod;

public class BaseTest {
    protected static App app = new App();
    protected static User validUser = UserFactory.getValidUser();

    @AfterMethod
    public void tearDownSuits() {
        app.common.stopApp();
    }
}
