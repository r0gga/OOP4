package oop4;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //bissl ideen rumprobieren:
        HashMap<Rider, Horse> mapping = new HashMap<>();
        Stable s1 = new Stable();

        System.out.println("Reiter: ");
        for(Rider r : s1.getRiders()){
            System.out.print(r.getName() +" " + r.getCharacteristic() + " ");
            for(Horse h : r.getPreferences()){
                System.out.print(h.getName() + ", ");
            }
            System.out.println();
        }

        System.out.println("\nPferde: ");
        for(Horse h : s1.getHorses()){
            System.out.println(h.getName()+ " " + h.getCharacteristic());
        }
       
        

    }
}