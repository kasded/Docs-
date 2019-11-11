package lv.javaguru.HomeWork6;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {
    public int[] createArray(int size) {

        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {

        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);


        }
        getSort(array);


    }

    public void printArrayToConsole(int[] array) {
        for (int elementOfArray : array) {


            System.out.println(elementOfArray);
        }


    }

    private void getSort(int[] array) {
        Arrays.sort(array);


    }

    public static int sumInArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;


        }
        System.out.println("Sum: " + sum);
        return sum;
    }


}


