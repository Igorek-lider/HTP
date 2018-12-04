package homework.lesson6.utils;

import static homework.lesson6.utils.Utils.buyCollectionVacuumCleaner;

public class StartLesson6 {

    public static void main(String[] args) {

        buyCollectionVacuumCleaner(10).forEach(System.out::println);
    }
}
