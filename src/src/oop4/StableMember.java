package oop4;

public class StableMember {
    final private String name;
    final private int characteristic;

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
