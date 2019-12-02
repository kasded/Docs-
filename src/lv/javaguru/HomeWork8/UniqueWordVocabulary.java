package lv.javaguru.HomeWork8;

import java.util.HashSet;
import java.util.Set;

/// Es nezinu ka dabut tos unique words, laikam cik unikalas lietas ir liste?
//Tieši tā,
// #1 izvedojam klasei ar metodēm: "addWord" un "getUniqueCount"
// #2 klasē iekiekam atributu "Set<String> vocabulary"
// #3 metode addWord pievieno elementu šai vocabulary
// #4 unikalie elemnti ir vocabulary.size(), jo "Set" satur sevī tikai unikalas vērtības
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
