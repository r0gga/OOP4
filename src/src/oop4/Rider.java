package oop4;

import java.util.HashSet;
import java.util.Set;

public class Rider {
    private String name;
    private Set<Horse> preferences;
    private int characteristic;

    public Rider(String name, int characteristic, Set<Horse> preferences){
        this.name = name;
        this.characteristic=characteristic;
        this.preferences = new HashSet<>(preferences);
    }

    public String getName(){
        return this.name;
    }
    public int getCharacteristic(){
        return this.characteristic;
    }
    public Set<Horse> getPreferences(){
        return this.preferences;
    }
}
