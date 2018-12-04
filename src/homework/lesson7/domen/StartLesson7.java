package homework.lesson7.domen;

import homework.lesson7.util.Utils;

import java.util.List;


public class StartLesson7 {

    public static void main(String[] args) {

        List<Film> films = Utils.generateCollectionFilms(10);


        films.forEach(System.out::println);
//        for (int i = 0; i < films.size(); i++) {
//
//            System.out.format("Пользователь: %s корректен? => %s%n", users.get(i).toString(), vldr.checkCorrectUserInfo());
//            System.out.println(vldr.printCorrectInfo());
//            System.out.println("");
//        }
    }

}
