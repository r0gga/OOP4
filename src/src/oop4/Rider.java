package oop4;

import java.util.HashSet;
import java.util.Set;

public class Rider {
    //hi
    private String name;
    private HashSet<Horse> preferences;

    public Rider(String name, Set<Horse> preferences){
        this.name = name;
        this.preferences = new HashSet<>(preferences);
    }
}
