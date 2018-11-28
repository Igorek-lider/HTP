package homework.lesson9.util;

import homework.lesson9.domen.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    static Random myRandom = new Random();

    public static List<User> generateCollectionUsers(int countUsers) {
        List<User> currentCollectionUsers = new ArrayList<>(countUsers);

        String[] loginArray = {"Fedorrrrrrrrrrrrrrrrr", "Igor", "Misha", "Sergey", "Vitaliy", "Dima"};
        String[] contryCodeArray = {"BY", "RU", "PL", "UA", "UK"};

        for (int i = 0; i < countUsers; i++) {
            currentCollectionUsers.add(new User(loginArray[myRandom.nextInt(loginArray.length)], myRandom.nextInt(99), contryCodeArray[myRandom.nextInt(contryCodeArray.length)]));
        }

        return currentCollectionUsers;
    }

    public static int randInt(int min, int max) {
        return myRandom.nextInt((max - min) + 1) + min;
    }
}
