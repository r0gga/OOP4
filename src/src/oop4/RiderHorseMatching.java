package oop4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RiderHorseMatching {

    private List<Rider> riders;
    private List<Horse> horses;
    private Map<Rider, Horse> bestMatches;
    private int maxMatches;

    public RiderHorseMatching(List<Rider> riders, List<Horse> horses){
        this.riders = riders;
        this.horses = horses;
        bestMatches = new HashMap<>();
        maxMatches = 0;
    }

    // match prüft, ob ein Reiter und ein Pferd eine gültige Kommbination bilden
    private boolean match(Rider rider, Horse horse){
        return rider.getCharacteristic() == horse.getCharacteristic() ||
                (rider.getCharacteristic() == 1 && horse.getCharacteristic() == 0) ||
                (rider.getCharacteristic() == 2 && horse.getCharacteristic() == 1 || horse.getCharacteristic() == 0);
    }

    //calculate Matches geht die zugeordneten Reiter und Pferde durch, und schaut, wie viele der Reiter ein gewünschtes Pferde bekommen haben
    private int calculateMatches(Map<Rider, Horse> assignments){
        int wishAssignments = 0;
        for(Map.Entry<Rider, Horse> entry : assignments.entrySet()){
            if(entry.getKey().getPreferences().contains(entry.getValue().getName())){
                wishAssignments++;
            }
        }
        return wishAssignments;
    }


}
