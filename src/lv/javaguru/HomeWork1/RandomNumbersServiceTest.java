package lv.javaguru.HomeWork1;

import java.util.Random;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {

        Random random = new Random();
        //mainīgo nosaukumiem ir jābut angliski
        int pirmaIzlase = random.nextInt(101);
        int otraIzlase = random.nextInt(101);
        int treshaIzlase = random.nextInt(101);

        System.out.println("Pirma = " + pirmaIzlase + " otra = " + otraIzlase + " tresha = " + treshaIzlase +
                " Visas izlases saskaititas kopa = " + (pirmaIzlase + otraIzlase + treshaIzlase));

    }
}
