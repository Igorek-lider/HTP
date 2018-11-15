package homework.lesson3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Terminal {

    public static void main(String[] args) {

        int countBus = 10;

        List<Bus> currentCollectionBus = buyCollectionBus(countBus);

        System.out.format("Список сгенерированных %d автобуссов:%n%n", countBus);
        currentCollectionBus.forEach(System.out::println);

        int minRouteExp = 100;
        System.out.format("%n%nСписок экспресс-автобусов (маршрут начинается с %d):%n", minRouteExp);
        getExpressBus(currentCollectionBus, minRouteExp).forEach(System.out::println);

        int yearBorder = 10;
        System.out.format("%n%nСписок автобусов, возраст которых более %d лет:%n", yearBorder);
        getOldBus(currentCollectionBus, yearBorder).forEach(System.out::println);

        int maxMileage = 450000;
        System.out.format("%n%nСписок автобусов, пробег которых превышает %d км:%n", maxMileage);
        getUpMileageBorderBus(currentCollectionBus, maxMileage).forEach(System.out::println);
    }


    static Random myRandom = new Random();

    public static List<Bus> buyCollectionBus(int countBus) {
        List<Bus> currentCollectionBus = new ArrayList<>(countBus);

        String[] fioArray = {"Иванов И.И.", "Петров Г.П.", "Васильев И.П.", "Барсук И.Л.", "Крот Т.П.", "Петруха К.Л."};
        String[] modelArray = {"Mercedes F650", "Mercedes R5950", "Mercedes H21", "Iveco S37", "Iveco H6897", "Маз 8256", "Маз 5555", "Маз 7777"};

        for (int i = 0; i < countBus; i++) {
            currentCollectionBus.add(new Bus(fioArray[myRandom.nextInt(fioArray.length)], myRandom.nextInt(9999), myRandom.nextInt(300), modelArray[myRandom.nextInt(modelArray.length)], randInt(2000, Calendar.getInstance().get(Calendar.YEAR)), randInt(10000, 850000)));
        }

        return currentCollectionBus;
    }

    public static int randInt(int min, int max) {
        return myRandom.nextInt((max - min) + 1) + min;
    }


    public static List<Bus> getExpressBus(List<Bus> collectionBus, int startRoute) {
        List<Bus> currentCollectionExpressBus = new ArrayList<>();

        for (Bus bus : collectionBus) {
            if (bus.getNumberRoute() > startRoute) currentCollectionExpressBus.add(bus);
        }
        return currentCollectionExpressBus;
    }

    public static List<Bus> getOldBus(List<Bus> collectionBus, int yearBorder) {
        int yearBord = Calendar.getInstance().get(Calendar.YEAR) - yearBorder;

        List<Bus> currentCollectionOldBus = new ArrayList<>();

        for (Bus bus : collectionBus) {
            if (bus.getProductionYear() < yearBord) currentCollectionOldBus.add(bus);
        }
        return currentCollectionOldBus;
    }

    public static List<Bus> getUpMileageBorderBus(List<Bus> collectionBus, int maxMileage) {
        List<Bus> currentCollectionMileageBorderBus = new ArrayList<>();

        for (Bus bus : collectionBus) {
            if (bus.getMileage() > maxMileage) currentCollectionMileageBorderBus.add(bus);
        }
        return currentCollectionMileageBorderBus;
    }
}
