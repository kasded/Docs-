package lv.javaguru.HomeWork1;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {

        Random random = new Random();

        int firstRNG = random.nextInt(101);
        int secondRNG = random.nextInt(101);
        int thirdRNG = random.nextInt(101);

        System.out.println("Pirma = " + firstRNG + " otra = " + secondRNG + " tresha = " + thirdRNG +
                " Visas izlases saskaititas kopa = " + (firstRNG + secondRNG + thirdRNG));

    }
}
