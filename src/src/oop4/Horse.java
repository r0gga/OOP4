package oop4;

/**
 * The Horse class represents a horse in a stable.
 * It extends the StableMember class and includes information about the horse's characteristic level.
 */
public class Horse extends StableMember{

    /**
     * Constructs a new Horse instance with the specified name and characteristic.
     *
     * @param name The name of the horse.
     * @param characteristic The characteristic level of the horse (0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter).
     */
 // 0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter
    public Horse(String name, int characteristic){
        super(name, characteristic);  
    }

  
}
