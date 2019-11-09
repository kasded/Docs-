package lv.javaguru.HomeWork5;

public class NumberService {

    public static void main(String[] args) {


    }

    public static void getEvenNumberCount(int firstNumber, int secondNumber) {
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("i " + i);
                sum = sum + i;
            }
        }

        if (firstNumber > secondNumber) {
            for (int j = secondNumber; j <= firstNumber; j++) {
                if (j % 2 == 0) {
                    sum = sum + j;
                    System.out.println("J " + j);
                }
            }
        }
        System.out.println("sum " + sum);
    }

    public static void sumInRange(int firstNumber, int secondNumber) {
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {

            System.out.println("i " + i);
            sum = sum + i;

        }

        if (firstNumber > secondNumber) {
            for (int j = secondNumber; j <= firstNumber; j++) {
                if (j % 2 == 0)
                    sum = sum + j;
                System.out.println("J " + j);

            }
        }
        System.out.println("sum " + sum);
    }


}



