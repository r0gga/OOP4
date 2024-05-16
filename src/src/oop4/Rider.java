package oop4;

import java.util.HashSet;
import java.util.Set;

public class Rider extends StableMember{

    final private Set<Horse> PREFERENCES;


    public Rider(String name, int characteristic, Set<Horse> preferences){
        super(name, characteristic);
        this.PREFERENCES = new HashSet<>(preferences);
    }

    public Set<Horse> getPreferences(){
        return this.PREFERENCES;
    }
}
