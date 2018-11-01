package htp;

import java.lang.reflect.Array;
import java.util.*;


public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println("Lesson 2. Home work\r\n");

//        runTask_1();
//        runTask_2();
//        runTask_3();
//        runTask_4();
//        runTask_5();
//        runTask_6();
//        runTask_7();
//        runTask_8();
//        runTask_9();
//        runTask_10();
//        runTask_11();
//        runTask_12();
//        runTask_13();
//        runTask_14();
//        runTask_15();
//        runTask_16();
//        runTask_17_18();
        runTask_19();
    }


    //Write a Java program to sort a numeric array and a string array.
    private static void runTask_1() {
        System.out.println("Task -> write a Java program to sort a numeric array and a string array\r\n");

        double[] massivNumber = {13, 7.6, 9.5, 10.5};

        System.out.println(String.format("Array number before sort: -> [%s, %s, %s, %s]",
                massivNumber[0], massivNumber[1], massivNumber[2], massivNumber[3]));

        for (int i = 0; i < massivNumber.length; i++) {
            double minValue = massivNumber[i];
            int minValueIndex = i;

            for (int j = i + 1; j < massivNumber.length; j++) {
                if (minValue > massivNumber[j]) {
                    minValue = massivNumber[j];
                    minValueIndex = j;
                }
            }

            if (i != minValueIndex) {
                double temp = massivNumber[i];
                massivNumber[i] = minValue;
                massivNumber[minValueIndex] = temp;
            }
        }

        System.out.println(String.format("Array number after sort: -> [%s, %s, %s, %s]\r\n----------------------------",
                massivNumber[0], massivNumber[1], massivNumber[2], massivNumber[3]));


        List<String> massivStr = Arrays.asList("Igor", "Marina", "Boris", "Masha", "Petr");

        System.out.println(String.format("Array string before sort: -> [%s, %s, %s, %s]",
                massivStr.get(0), massivStr.get(1), massivStr.get(2), massivStr.get(3)));

        Collections.sort(massivStr);

        System.out.println(String.format("Array string after sort: -> [%s, %s, %s, %s]",
                massivStr.get(0), massivStr.get(1), massivStr.get(2), massivStr.get(3)));

    }

    //Write a Java program to sum values of an array
    private static void runTask_2() {
        System.out.println("Task -> write a Java program to sum values of an array\r\n");
        double[] massivNumber = {13, 7.6, 9.5, 10.5};

        double sum = 0;

        for (double f : massivNumber) {
            sum += f;
        }

        System.out.println(String.format("Array: -> [%s, %s, %s, %s]; Sum -> %s",
                massivNumber[0], massivNumber[1], massivNumber[2], massivNumber[3], sum));

    }

    //Write a Java program to print the following grid
    private static void runTask_3() {
        System.out.println("Task -> write a Java program to print the following grid\r\n");

        for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 30; a++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    //Write a Java program to calculate the average value of array elements.
    private static void runTask_4() {
        System.out.println("Task -> write a Java program to calculate the average value of array elements. \r\n");

        double[] arrNumber = {13, 7.6, 9.5, 10.5};
        double average = 0;

        for (double f : arrNumber) {
            average += f;
        }
        average = average / arrNumber.length;

        System.out.println(String.format("Array: -> [%s, %s, %s, %s]; Average -> %s",
                arrNumber[0], arrNumber[1], arrNumber[2], arrNumber[3], average));
    }

    //Write a Java program to test if an array contains a specific value.
    private static void runTask_5() {
        System.out.println("Task -> write a Java program to test if an array contains a specific value. \r\n");

        double[] arrNumber = {13, 7.6, 9.5, 10.5};
        double searchValue = 7.6;
        boolean resultSearchValue = false;

        for (double f : arrNumber) {
            if (f == searchValue) {
                resultSearchValue = true;
                break;
            }
        }

        System.out.println(String.format("Array: -> [%s, %s, %s, %s] contains %s ? -> %s",
                arrNumber[0], arrNumber[1], arrNumber[2], arrNumber[3], searchValue, resultSearchValue));
    }

    //Write a Java program to find the index of an array element.
    private static void runTask_6() {
        System.out.println("Task -> Write a Java program to find the index of an array element. \r\n");

        double[] arrNumber = {13, 7.6, 9.5, 10.5};
        double searchValue = 9.5;
        int indexValue = -1;

        for (int i = 0; i < arrNumber.length; i++) {

            if (arrNumber[i] == searchValue) {
                indexValue = i;
                break;
            }
        }

        System.out.println(String.format("Array: -> [%s, %s, %s, %s], index %s ? -> %s",
                arrNumber[0], arrNumber[1], arrNumber[2], arrNumber[3], searchValue, indexValue));
    }

    //Write a Java program to remove a specific element from an array.
    private static void runTask_7() {
        System.out.println("Task -> Write a Java program to remove a specific element from an array. \r\n");

        double[] arrNumber = {13, 7.6, 9.5, 10.5};
        double searchValue = 9.5;
        int indexValue = -1;

        System.out.print(String.format("Array: -> [%s, %s, %s, %s], deleteValue %s ;",
                arrNumber[0], arrNumber[1], arrNumber[2], arrNumber[3], searchValue));

        //реализация для одного совпадения
        for (int i = 0; i < arrNumber.length; i++) {

            if (arrNumber[i] == searchValue) {
                indexValue = i;
                break;
            }
        }

        //сдвигаем элементы
        if (indexValue != -1) {
            for (int i = indexValue; i < arrNumber.length - 1; i++) {
                arrNumber[i] = arrNumber[i + 1];
            }
        }
        double[] arrNumberResult = Arrays.copyOf(arrNumber, arrNumber.length - 1);

        System.out.println(String.format(" -> resultArray: -> [%s, %s, %s]",
                arrNumberResult[0], arrNumberResult[1], arrNumberResult[2]));
    }

    // Write a Java program to copy an array by iterating the array.
    private static void runTask_8() {
        System.out.println("Task ->  Write a Java program to copy an array by iterating the array. \r\n");

        double[] arrNumberFrom = {13, 7.6, 9.5, 10.5};
        double[] arrNumberTo = new double[arrNumberFrom.length];

        for (int i = 0; i < arrNumberFrom.length; i++) {
            arrNumberTo[i] = arrNumberFrom[i];
        }

        System.out.print(String.format("ArrayFrom: -> [%s, %s, %s, %s], ArrayTo: -> [%s, %s, %s, %s]",
                arrNumberFrom[0], arrNumberFrom[1], arrNumberFrom[2], arrNumberFrom[3],
                arrNumberTo[0], arrNumberTo[1], arrNumberTo[2], arrNumberTo[3]));
    }


    // Write a Java program to insert an element (specific position) into an array.
    private static void runTask_9() {
        System.out.println("Task ->  Write a Java program to insert an element (specific position) into an array. \r\n");

        double[] arrNumberFrom = {13, 7.6, 9.5, 10.5};
        double[] arrNumberTo = new double[arrNumberFrom.length + 1];
        double insertValue = 36.6;
        int indexInsert = 3;

        for (int i = 0; i < arrNumberFrom.length; i++) {
            if (i != indexInsert) {
                arrNumberTo[i] = arrNumberFrom[i];
            } else {
                arrNumberTo[i] = insertValue;
                break;
            }
        }

        for (int i = indexInsert; i < arrNumberFrom.length; i++) {
            arrNumberTo[i + 1] = arrNumberFrom[i];
        }

        System.out.print(String.format("ArrayFrom: -> [%s, %s, %s, %s], insertValue -> %s, position -> %s; ArrayTo: -> [%s, %s, %s, %s, %s]",
                arrNumberFrom[0], arrNumberFrom[1], arrNumberFrom[2], arrNumberFrom[3], insertValue, indexInsert,
                arrNumberTo[0], arrNumberTo[1], arrNumberTo[2], arrNumberTo[3], arrNumberTo[4]));
    }

    // Write a Java program to find the maximum and minimum value of an array.
    private static void runTask_10() {
        System.out.println("Task ->  Write a Java program to find the maximum and minimum value of an array. \r\n");

        double[] arrNumber = {13, 7.6, -9.5, 10.5};
        double minValue = arrNumber[0];
        double maxValue = arrNumber[0];

        for (double f : arrNumber) {
            if (minValue > f)
                minValue = f;

            if (maxValue < f)
                maxValue = f;
        }

        System.out.println(String.format("Array: -> [%s, %s, %s, %s], minValue -> %s, maxValue -> %s",
                arrNumber[0], arrNumber[1], arrNumber[2], arrNumber[3], minValue, maxValue));
    }


    // Write a Java program to reverse an array of integer values.
    private static void runTask_11() {
        System.out.println("Task ->  Write a Java program to reverse an array of integer values. \r\n");

        double[] arrNumberFrom = {13, 7.6, 9.5, 10.5};
        double[] arrNumberTo = new double[arrNumberFrom.length];

        for (int i = 0; i < arrNumberFrom.length; i++) {
            arrNumberTo[arrNumberFrom.length - 1 - i] = arrNumberFrom[i];
        }

        System.out.print(String.format("ArrayFrom: -> [%s, %s, %s, %s], ArrayTo: -> [%s, %s, %s, %s]",
                arrNumberFrom[0], arrNumberFrom[1], arrNumberFrom[2], arrNumberFrom[3],
                arrNumberTo[0], arrNumberTo[1], arrNumberTo[2], arrNumberTo[3]));
    }

    //Write a Java program to find the duplicate values of an array of integer values.
    private static void runTask_12() {
        System.out.println("Task -> Write a Java program to find the duplicate values of an array of integer values. \r\n");

        int[] arrNumber = {13, 7, 9, 10, 7, 26, 1, 7, 26};

        System.out.println(String.format("Array: -> [%s, %s, %s, %s, %s, %s, %s, %s, %s ]\r\n",
                arrNumber[0], arrNumber[1], arrNumber[2], arrNumber[3], arrNumber[4], arrNumber[5], arrNumber[6],
                arrNumber[7], arrNumber[8]));


        ArrayList<Integer> duplList = new ArrayList<Integer>();


        for (int i = 0; i < arrNumber.length; i++) {

            boolean isExistDubl = false;
            for (int j = i + 1; j < arrNumber.length; j++) {

                if (arrNumber[i] == arrNumber[j] &&
                        !duplList.contains(arrNumber[i])) {

                    if (!isExistDubl) {
                        System.out.print(String.format("Duplicate values -> %s, position -> %s", arrNumber[i], i));
                    }
                    isExistDubl = true;

                    System.out.print(String.format(" %s", j));
                }
            }

            if (isExistDubl) {
                duplList.add(arrNumber[i]);
                System.out.println();
            }
        }
    }


    //Write a Java program to find the duplicate values of an array of string values.
    private static void runTask_13() {
        System.out.println("Task -> Write a Java program to find the duplicate values of an array of string values.\r\n");

        String[] arrStr = {"Petr", "Vitaliy", "Nikolay", "Marina", "Den", "Petr", "Nikolay", "Maks", "Nikolay"};

        System.out.println(String.format("Array: -> [%s, %s, %s, %s, %s, %s, %s, %s, %s ]\r\n",
                arrStr[0], arrStr[1], arrStr[2], arrStr[3], arrStr[4], arrStr[5], arrStr[6],
                arrStr[7], arrStr[8]));


        ArrayList<String> duplList = new ArrayList<>();

        for (int i = 0; i < arrStr.length; i++) {

            boolean isExistDubl = false;
            for (int j = i + 1; j < arrStr.length; j++) {

                if (arrStr[i] == arrStr[j] &&
                        !duplList.contains(arrStr[i])) {

                    if (!isExistDubl) {
                        System.out.print(String.format("Duplicate values -> %s, position -> %s", arrStr[i], i));
                    }
                    isExistDubl = true;

                    System.out.print(String.format(" %s", j));
                }
            }

            if (isExistDubl) {
                duplList.add(arrStr[i]);
                System.out.println();
            }
        }
    }


    //Write a Java program to find the common elements between two arrays (string values).
    private static void runTask_14() {
        System.out.println("Task -> Write a Java program to find the common elements between two arrays (string values).\r\n");

        String[] arrStr1 = {"Petr", "Vitaliy", "Nikolay", "Marina", "Den", "Petr", "Nikolay", "Maks", "Nikolay"};
        String[] arrStr2 = {"Pedro", "Igor", "Nik", "Marina", "Deny", "Pedro", "Nikolay", "Maks", "Nik"};

        System.out.println(String.format("Array #1: -> [%s, %s, %s, %s, %s, %s, %s, %s, %s ]",
                arrStr1[0], arrStr1[1], arrStr1[2], arrStr1[3], arrStr1[4], arrStr1[5], arrStr1[6],
                arrStr1[7], arrStr1[8]));

        System.out.println(String.format("Array #2: -> [%s, %s, %s, %s, %s, %s, %s, %s, %s ]\r\n",
                arrStr2[0], arrStr2[1], arrStr2[2], arrStr2[3], arrStr2[4], arrStr2[5], arrStr2[6],
                arrStr2[7], arrStr2[8]));


        ArrayList<String> commonList = new ArrayList<>();

        for (int i = 0; i < arrStr1.length; i++) {

            if (!commonList.contains(arrStr1[i])) {

                boolean isExistCommonValue = false;
                for (int j = 0; j < arrStr2.length; j++) {

                    if (arrStr1[i] == arrStr2[j] &&
                            !isExistCommonValue) {

                        System.out.print(String.format("Common element -> %s", arrStr1[i]));
                        isExistCommonValue = true;
                        break;
                    }
                }

                if (isExistCommonValue) {
                    commonList.add(arrStr1[i]);
                    System.out.println();
                }
            }
        }
    }

    //Write a Java program to find the common elements between two arrays of integers
    private static void runTask_15() {
        System.out.println("Task -> Write a Java program to find the common elements between two arrays of integers.\r\n");

        int[] arrStr1 = {7, 13, 27, -5, 9, 84, 96, 3, 5};
        int[] arrStr2 = {36, 24, 2, 5, 91, 86, 27, 7, 58};

        System.out.println(String.format("Array #1: -> [%s, %s, %s, %s, %s, %s, %s, %s, %s ]",
                arrStr1[0], arrStr1[1], arrStr1[2], arrStr1[3], arrStr1[4], arrStr1[5], arrStr1[6],
                arrStr1[7], arrStr1[8]));

        System.out.println(String.format("Array #2: -> [%s, %s, %s, %s, %s, %s, %s, %s, %s ]\r\n",
                arrStr2[0], arrStr2[1], arrStr2[2], arrStr2[3], arrStr2[4], arrStr2[5], arrStr2[6],
                arrStr2[7], arrStr2[8]));


        ArrayList<Integer> commonList = new ArrayList<>();

        for (int i = 0; i < arrStr1.length; i++) {

            if (!commonList.contains(arrStr1[i])) {

                boolean isExistCommonValue = false;
                for (int j = 0; j < arrStr2.length; j++) {

                    if (arrStr1[i] == arrStr2[j] &&
                            !isExistCommonValue) {

                        System.out.print(String.format("Common element -> %s", arrStr1[i]));
                        isExistCommonValue = true;
                        break;
                    }
                }

                if (isExistCommonValue) {
                    commonList.add(arrStr1[i]);
                    System.out.println();
                }
            }
        }
    }

    //Write a Java program to remove a specific element from an array.
    private static void runTask_16() {
        System.out.println("Task -> Write a Java program to remove duplicate elements from an array. \r\n");

        double[] arrNumber = {13, 7.6, 9.5, 10.5, 13, 76.1, 7.6, 5.7};

        System.out.println(String.format("Array: -> %s", Arrays.toString(arrNumber)));

        ArrayList<Integer> duplicateIndexList = new ArrayList<Integer>();

        for (int i = 0; i < arrNumber.length; i++) {

            if (!duplicateIndexList.contains(i)) {
                boolean isExistDuplicatenValue = false;

                for (int j = i + 1; j < arrNumber.length; j++) {

                    if (arrNumber[i] == arrNumber[j]) {
                        duplicateIndexList.add(j);
                        isExistDuplicatenValue = true;
                    }
                }
                if (isExistDuplicatenValue)
                    duplicateIndexList.add(i);
            }
        }
        double[] arrNumberResult = new double[arrNumber.length - duplicateIndexList.size()];

        int index = 0;
        for (int i = 0; i < arrNumber.length; i++) {
            if (!duplicateIndexList.contains(i)) {
                arrNumberResult[index] = arrNumber[i];
                index++;
            }
        }

        System.out.println(String.format("ArrayResult: -> %s", Arrays.toString(arrNumberResult)));
    }

    // Write a Java program to find the second largest element in an array.
    //Write a Java program to find the second smallest element in an array
    private static void runTask_17_18() {
        System.out.println("Task ->  Write a Java program to find the second largest element in an array.\r\n\t" +
                "Write a Java program to find the second smallest element in an array");

        double[] arrNumber = {13, 7.6, 9.5, 10.5, 26, 76.1, 76, 5.7};


        //для массивов с количеством элементов 2 и более
        Arrays.sort(arrNumber);
        double secondLarg = arrNumber[1];
        double secondSmall = arrNumber[arrNumber.length - 2];

        System.out.println(String.format("Array: -> %s; second largest element -> %s, second smallest element -> %s",
                Arrays.toString(arrNumber), secondLarg, secondSmall));

    }

    //Write a Java program to add two matrices of the same size.
    private static void runTask_19() {

        System.out.println("Task -> Write a Java program to add two matrices of the same size.\r\n");

        int rowsCount = 5;
        int columnsCount = 10;

        int[][] matrice1 = new int[rowsCount][columnsCount];
        int[][] matrice2 = new int[rowsCount][columnsCount];

        Random random = new Random();

        for (int i = 0; i < rowsCount; i++) {
            for (int a = 0; a < columnsCount; a++) {
                matrice1[i][a] = random.nextInt(100);
                matrice2[i][a] = random.nextInt(100);
            }
        }

        System.out.println("Matrice #1:\r\n");
        for (int i = 0; i < rowsCount; i++) {
            System.out.println(Arrays.toString(matrice1[i]));
        }

        System.out.println("\r\nMatrice #2:\r\n");
        for (int i = 0; i < rowsCount; i++) {
            System.out.println(Arrays.toString(matrice2[i]));
        }
    }

}
