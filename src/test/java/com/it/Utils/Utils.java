package com.it.Utils;

import com.it.Users.User;
import com.it.Users.UserFactory;
import sun.awt.windows.ThemeReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Utils {
    static public class Data {
        static public String getRandomName() {
            ArrayList<String> name = new ArrayList<>(asList("Елена", "Виктория", "Татьяна", "Ирина", "Полина", "Марина", "Юлия"));
            return name.get(new Random().nextInt(name.size()));
        }

        static public String getRandomLastName() {
            ArrayList<String> name = new ArrayList<>(asList("Василенко", "Репченко", "Хоменко", "Дубицкая", "Олежко", "Кудина", "Дмитренко"));
            return name.get(new Random().nextInt(name.size()));
        }

        static public String getRandomEmail() {
            return getRandomString(18)+"@gmail.com";
        }

        static public String getRandomString(int count) {
            return new Random().ints('a', 'z').limit(count).mapToObj(s -> "" + (char) s)
                    .collect(Collectors.joining());
        }
        static public String getValidEmail() {
            return UserFactory.getValidUser().getEmail();
        }

        static public String getRandomSubject() {
            if (randomSubject.equals("")) {
                randomSubject = getRandomString(10);
            }
            return randomSubject;
        }

        static public String getRandomTextBody() {
            if (randomTextBody.equals("")) {
                randomTextBody = getRandomString(50);
            }
            return randomTextBody;
        }

        private static String randomSubject = "";
        private static String randomTextBody = "";

    }

}