package lv.javaguru.HomeWork5;

public class NumberService {

    //šeit "main" metode nav vajadzīga
    public static void main(String[] args) {


    }

    //metodei ir jāatdod rezultāts
    public static void getEvenNumberCount(int firstNumber, int secondNumber) {
        int sum = 0;

        //pārbaude "if (firstNumber > secondNumber) {" vajag jau sākumā,
        // citādi sanāk ka loģika izpildās vismaz vienu reizi, bet atevišķos gadījumos 2
        //taču ja šo iznes atsevišķā metodē, tad mainīgos tai var padot dažādā secībā
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("i " + i);
                sum = sum + i; //rakstam īsāk: sum =+ i;
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

    //skatīt komentārus iepriekš
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



