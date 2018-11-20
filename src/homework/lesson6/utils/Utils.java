package homework.lesson6.utils;

import homework.lesson6.domen.Device;
import homework.lesson6.domen.EnergySaving;
import homework.lesson6.domen.VacuumCleaner;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {

    private static Random myRandom = new Random();

    /**
     * возвращает случайное число в дипазоне min-max
     *
     * @param min начало диапазона
     * @param max конец диапазона
     * @return случайное число
     */
    public static int randInt(int min, int max) {
        return myRandom.nextInt((max - min) + 1) + min;
    }


    /**
     * метод возвращает коллекцию бытовых пылесосов количеством countDevice
     *
     * @param countDevice количество пылесосов
     * @return коллекция бытовых пылесосов
     */
    public static List<Device> buyCollectionVacuumCleaner(int countDevice) {

        List<Device> currentCollection = new ArrayList<>(countDevice);

        for (int i = 0; i < countDevice; i++) {
            currentCollection.add(new VacuumCleaner(Utils.randInt(1000000, 10000000), EnergySaving.values()[Utils.randInt(0, 2)], Utils.randInt(100, 10000)));
        }
        return currentCollection;
    }
}
