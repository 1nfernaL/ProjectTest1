package com.it.Steps;

import com.it.Pages.LoginPage;
import com.it.Users.User;
import com.it.Users.UserFactory;

public class LoginSteps extends LoginPage {
    public void login(User user) {
        login(user.getLogin(), user.getPassword());
    }

    public void loginValidUser() {
        User user = UserFactory.getValidUser();
        login(user.getLogin(),user.getPassword());
    }
}
