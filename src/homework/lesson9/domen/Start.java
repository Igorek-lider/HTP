package homework.lesson9.domen;

import homework.lesson9.util.Utils;

import java.util.List;


public class Start {

    public static void main(String[] args) {

        List<User> users = Utils.generateCollectionUsers(7);

        for (int i = 0; i < users.size(); i++) {
            UserValidator vldr = new UserValidator(users.get(i));

            System.out.format("Пользователь: %s корректен? => %s%n", users.get(i).toString(), vldr.checkCorrectUserInfo());
            System.out.println(vldr.printCorrectInfo());
            System.out.println("");
        }
    }
}
