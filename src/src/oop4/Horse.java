package oop4;

public class Horse {

    private String name;
    private int characteristic;

    public Horse(String name, int characteristic){ //constructor war voher private, aber wieso? xd
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
