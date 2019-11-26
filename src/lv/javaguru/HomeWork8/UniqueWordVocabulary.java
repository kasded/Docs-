package lv.javaguru.HomeWork8;

import java.util.HashSet;
import java.util.Set;

/// Es nezinu ka dabut tos unique words, laikam cik unikalas lietas ir liste?
public class UniqueWordVocabulary {


    public static void main(String[] args) {


        Set<String> cities = new HashSet<>();
        cities.add("Riga");
        cities.add("Jelgava");
        cities.add("Liepaja");


        printToConsole(cities);

    }

    private static void printToConsole(Set<String> cities) {
        System.out.println(cities);
    }
}
