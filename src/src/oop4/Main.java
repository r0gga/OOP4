package oop4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Main class serves as the entry point for the Rider-Horse Matching application.
 * It creates instances of the Stable and RiderHorseMatching classes, sorts the riders and horses,
 * performs the matching, and prints the results.
 * @author Oskar Oetken, Aaron Masur
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Stable st1 = new Stable();
        RiderHorseMatching rhma = new RiderHorseMatching(st1.getRiders(), st1.getHorses());

        List<Horse> sortedHorses = rhma.sortHorsesDescending(st1.getHorses());
        List<Rider> sortedRiders = rhma.sortRidersAscending(st1.getRiders());
        List<String> mylist = new ArrayList<>();

        //MatchingResult result = rhma.matching(st1.getRiders(), st1.getHorses());
        MatchingResult result = rhma.matching(sortedRiders, sortedHorses);
        System.out.println(result.toString());
        System.out.println("Anzahl Personen mit Wunsch: " + sortedRiders.size());
        System.out.println("Calls zum vergleich von sortiertenlisten Ausfruf vs unsortiert: " + rhma.calls);
    }
}