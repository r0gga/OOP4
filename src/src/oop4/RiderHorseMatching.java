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


}
