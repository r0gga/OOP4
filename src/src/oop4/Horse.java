package oop4;

public class Horse {

    private String name;
    private int characteristic; // 0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter

    public Horse(String name, int characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getName(){
        return this.name;
    }
    public int getCharacteristic(){
        return characteristic;
    }
}
