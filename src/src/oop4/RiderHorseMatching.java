package oop4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.MatchResult;

public class RiderHorseMatching{

    private final List<Rider> riders;
    private final List<Horse> horses;
    private final List<Rider> sortedRiders;
    private final List<Horse> sortedHorses;
    private boolean[][] adjacencyMatrix;
    int calls;

    public RiderHorseMatching(List<Rider> riders, List<Horse> horses) {
        this.riders = riders;
        this.horses = horses;
        calls=0;
        sortedHorses = sortHorsesDescending(horses);
        sortedRiders = sortRidersAscending(riders);

        // adjacencyMatrix[i][j]==true: i-ter Reiter in sortedRiders matcht mit j-tem
        // Pferd in sortedHorses
        adjacencyMatrix = new boolean[sortedRiders.size()][sortedHorses.size()];
        fillAdjacencyMatrix();
    }

    // private machen
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

    public boolean isMatch(Rider r, Horse h) {
        return r.getCharacteristic() >= h.getCharacteristic() && r.getPreferences().contains(h);
    }

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

    public MatchingResult matching (List<Rider> riders, List<Horse> horses){
        
        
        MatchingResult result = new MatchingResult();

        for(Rider rider : riders){
            for(Horse horse: horses){
                calls++;
                if(isMatch(rider, horse)){
                    List<Rider> new_riders = new ArrayList<>(riders.size());
                    new_riders.addAll(riders);
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
