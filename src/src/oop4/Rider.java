package oop4;

import java.util.HashSet;
import java.util.Set;
/**
 * The Rider class represents a rider in a stable.
 * It extends the StableMember class and includes additional information about the rider's horse preferences.
 */

public class Rider extends StableMember{

    /**
     * The set of horses that the rider prefers.
     */
    final private Set<Horse> PREFERENCES;

    /**
     * Constructs a new Rider instance with the specified name, characteristic, and preferences.
     *
     * @param name The name of the rider.
     * @param characteristic The characteristic level of the rider (0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter).
     * @param preferences The set of horses that the rider prefers.
     */
    public Rider(String name, int characteristic, Set<Horse> preferences){
        super(name, characteristic);
        this.PREFERENCES = new HashSet<>(preferences);
    }

    /**
     * Gets the set of horses that the rider prefers.
     *
     * @return The set of preferred horses.
     */
    public Set<Horse> getPreferences(){
        return this.PREFERENCES;
    }
}
