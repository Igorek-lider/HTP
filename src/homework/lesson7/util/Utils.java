package homework.lesson7.util;

import homework.lesson7.domen.Country;
import homework.lesson7.domen.Film;
import homework.lesson7.domen.FilmGenre;
import homework.lesson7.domen.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Utils {

    static Random myRandom = new Random();

    public static List<Film> generateCollectionFilms(int countFilm) {
        List<Film> currentCollectionFilms = new ArrayList<>(countFilm);

        String[] prodArray = {"Fedor", "Igor", "Misha", "Sergey", "Vitaliy", "Dima"};

        for (int i = 0; i < countFilm; i++) {
            currentCollectionFilms.add(new Film(Country.values()[myRandom.nextInt(Country.values().length - 1)], Language.values()[myRandom.nextInt(Language.values().length - 1)], myRandom.nextInt(1000000), myRandom.nextInt(240), FilmGenre.values()[myRandom.nextInt(FilmGenre.values().length - 1)], prodArray[myRandom.nextInt(prodArray.length - 1)]));
        }

        return currentCollectionFilms;
    }
}