package oop4;

public class StableMember {
    final private String name;
    final private int characteristic; // 0 = Anfänger, 1 = gute Reiter, 2 = sehr gute Reiter

    public StableMember(String name, int characteristic){
        this.name=name;
        this.characteristic=characteristic;
    }


    public String getName(){
        return this.name;
    }
    public int getCharacteristic(){
        return this.getCharacteristic();
    }
}
