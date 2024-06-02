package oop4;

/**
 * The StableMember class represents a member of the stable, which could be a rider or a horse.
 * Each member has a name and a characteristic level indicating their skill or ability.
 */

public class StableMember {
    /**
     * The name of the stable member.
     */
    final private String NAME;
    /**
     * The characteristic level of the stable member, where:
     * 0 = Beginner,
     * 1 = Good rider,
     * 2 = Very good rider.
     */
    final private int CHARACTERISTIC; // 0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter

    /**
     * Constructs a new StableMember with the specified name and characteristic level.
     *
     * @param name The name of the stable member.
     * @param characteristic The characteristic level of the stable member.
     */
    public StableMember(String name, int characteristic){
        this.NAME=name;
        this.CHARACTERISTIC=characteristic;
    }

    /**
     * Gets the name of the stable member.
     *
     * @return The name of the stable member.
     */
    public String getName(){
        return this.NAME;
    }
    /**
     * Gets the characteristic level of the stable member.
     *
     * @return The characteristic level of the stable member.
     */
    public int getCharacteristic(){
        return this.CHARACTERISTIC;
    }
}
