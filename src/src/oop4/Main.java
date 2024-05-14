package oop4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Stable stable = new Stable();
        RiderHorseMatching test = new RiderHorseMatching(stable.getRiders(), stable.getHorses());

        //array das angibt, ob ein Pferd vergeben ist, für findBestMatches Methode
        boolean[] horseOccupied = new boolean[stable.getHorses().size()];

        // Map, die die aktuellen Matches speichert, für findBestMatches Methode

        Map<Rider, Horse> currentAsignments = new HashMap<>();

        test.findBestMatches(0, currentAsignments, horseOccupied);


        //bissl ideen rumprobieren:
        /*HashMap<Rider, Horse> mapping = new HashMap<>();

        System.out.println("Reiter: ");
        for(Rider r : stable.getRiders()){
            System.out.print(r.getName() +" " + r.getCharacteristic() + " ");
            for(Horse h : r.getPreferences()){
                System.out.print(h.getName() + ", ");
            }
            System.out.println();
        }

        System.out.println("\nPferde: ");
        for(Horse h : stable.getHorses()){
            System.out.println(h.getName()+ " " + h.getCharacteristic());
        }*/
       



    }
}