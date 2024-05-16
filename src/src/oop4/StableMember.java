package oop4;

public class StableMember {
    final private String NAME;
    final private int CHARACTERISTIC; // 0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter

    public StableMember(String name, int characteristic){
        this.NAME=name;
        this.CHARACTERISTIC=characteristic;
    }


    public String getName(){
        return this.NAME;
    }
    public int getCharacteristic(){
        return this.CHARACTERISTIC;
    }
}
