package com.it.Users;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.it.Utils.Utils.Data.*;

public class UserFactory  {
    static ResourceBundle bundle = ResourceBundle.getBundle("user");

    public static User getValidUser() {
        return new User(getRandomName(), getRandomLastName(),
                bundle.getString("validLogin"),
                bundle.getString("validPassword"),
                bundle.getString("validEmail"));
    }

    public static ArrayList<User> getRandomUser(int count) {
        ArrayList<User> collect=(ArrayList<User>)
        Stream.generate(() -> new User(getRandomName(), getRandomLastName(), getRandomString(15), getRandomString(16),
                getRandomEmail())).limit(count).collect(Collectors.toList());
        return collect;
    }
}
