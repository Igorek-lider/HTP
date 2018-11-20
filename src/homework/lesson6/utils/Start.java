package homework.lesson6.utils;

import static homework.lesson6.utils.Utils.buyCollectionVacuumCleaner;

public class Start {

    public static void main(String[] args) {

        buyCollectionVacuumCleaner(10).forEach(System.out::println);
    }
}
