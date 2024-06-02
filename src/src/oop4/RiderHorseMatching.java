package oop4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;
/**
 * The RiderHorseMatching class provides functionality to match riders with horses
 * based on their characteristics and preferences. It sorts the horses in descending
 * order and the riders in ascending order by their characteristic levels, and finds
 * the optimal matching.
 */

public class RiderHorseMatching{

    /**
     * The list of riders.
     */
    private final List<Rider> riders;
    /**
     * The list of horses.
     */
    private final List<Horse> horses;
    /**
     * The list of sorted riders in ascending order by their characteristic levels.
     */
    private final List<Rider> sortedRiders;
    /**
     * The list of sorted horses in descending order by their characteristic levels.
     */
    private final List<Horse> sortedHorses;
    //private boolean[][] adjacencyMatrix;
    /**
     * The number of calls made to the matching function.
     */
    int calls;

    /**
     * Constructs a new RiderHorseMatching instance with the specified list of riders and horses.
     * Initializes the sorted lists and the call count.
     *
     * @param riders The list of riders.
     * @param horses The list of horses.
     */
    public RiderHorseMatching(List<Rider> riders, List<Horse> horses) {
        this.riders = riders;
        this.horses = horses;
        calls=0;
        sortedHorses = sortHorsesDescending(horses);
        sortedRiders = sortRidersAscending(riders);

        // adjacencyMatrix[i][j]==true: i-ter Reiter in sortedRiders matcht mit j-tem
        // Pferd in sortedHorses
        //adjacencyMatrix = new boolean[sortedRiders.size()][sortedHorses.size()];
        //fillAdjacencyMatrix();
    }

    /**
     * Sorts the horses in descending order by their characteristic levels.
     *
     * @param list The list of horses to be sorted.
     * @return A list of horses sorted in descending order by their characteristic levels.
     */
    public List<Horse> sortHorsesDescending(List<Horse> list) {
        List<Horse> sorted = new ArrayList<>();
        for (Horse h : list) {
            if (h.getCharacteristic() == 2) {
                sorted.add(h);
            }
        }
        for (Horse h : list) {
            if (h.getCharacteristic() == 1) {
                sorted.add(h);
            }
        }
        for (Horse h : list) {
            if (h.getCharacteristic() == 0) {
                sorted.add(h);
            }
        }

        return sorted;
    }

    /**
     * Sorts the riders in ascending order by their characteristic levels.
     *
     * @param list The list of riders to be sorted.
     * @return A list of riders sorted in ascending order by their characteristic levels.
     */
    public List<Rider> sortRidersAscending(List<Rider> list) {
        List<Rider> sorted = new ArrayList<>();

        for (Rider r : list) {
            if (r.getCharacteristic() == 0) {
                sorted.add(r);
            }
        }
        for (Rider r : list) {
            if (r.getCharacteristic() == 1) {
                sorted.add(r);
            }
        }
        for (Rider r : list) {
            if (r.getCharacteristic() == 2) {
                sorted.add(r);
            }
        }

        return sorted;
    }

    /**
     * Checks if a rider and a horse are a match based on their characteristics and preferences.
     *
     * @param r The rider.
     * @param h The horse.
     * @return True if the rider can ride the horse and the horse is in the rider's preferences, false otherwise.
     */
    public boolean isMatch(Rider r, Horse h) {
        return r.getCharacteristic() >= h.getCharacteristic() && r.getPreferences().contains(h);
    }

    /*
    public void fillAdjacencyMatrix() {
        for (int i = 0; i < sortedRiders.size(); i++) {
            for (int j = 0; j < sortedHorses.size(); j++) {
                if (isMatch(sortedRiders.get(i), sortedHorses.get(j))) {
                    adjacencyMatrix[i][j] = true;
                } else {
                    adjacencyMatrix[i][j] = false;
                }
            }
        }
    }
     

    public void printAdjacencyMatrix() {
        System.out.print("      ");
        for (Horse h : sortedHorses) {
            System.out.print(h.getName() + " ");
        }
        System.out.println();
        for (int i = 0; i < sortedRiders.size(); i++) {
            System.out.print(sortedRiders.get(i).getName() + ": ");
            for (int j = 0; j < sortedHorses.size(); j++) {
                System.out.print(adjacencyMatrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
    */

    /**
     * Finds the optimal matching of riders to horses and returns the result.
     * The matching is done recursively and the solution with the highest score is selected.
     *
     * @param riders The list of riders to be matched.
     * @param horses The list of horses to be matched.
     * @return The matching result containing the optimal pairs and the score.
     */
    public MatchingResult matching (List<Rider> riders, List<Horse> horses){
        
        
        MatchingResult result = new MatchingResult();
        calls++;
        for(Rider rider : riders){
            for(Horse horse: horses){
               
                if(isMatch(rider, horse)){
                    List<Rider> new_riders = new ArrayList<>(riders.size());
                    new_riders.addAll(riders); //muss so sonst java.util.ConcurrentModificationException
                    new_riders.remove(rider);

                    List<Horse> new_horses = new ArrayList<>(horses.size());
                    new_horses.addAll(horses);
                    new_horses.remove(horse);

                    MatchingResult new_result = matching(new_riders, new_horses);
                    new_result.getMap().put(rider, horse);
                    new_result.increaseScore();

                    if(new_result.getScore()>result.getScore()){
                        result=new_result;
                    }

                }
            }
        }

        return result;
    }


}
