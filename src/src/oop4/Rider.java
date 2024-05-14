package oop4;

import java.util.HashSet;
import java.util.Set;

public class Rider extends StableMember{

    private Set<Horse> preferences;


    public Rider(String name, int characteristic, Set<Horse> preferences){
        super(name, characteristic);
        this.preferences = new HashSet<>(preferences);
    }

    public Set<Horse> getPreferences(){
        return this.preferences;
    }
}
