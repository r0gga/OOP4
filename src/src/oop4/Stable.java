package oop4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Stable {
    private List<Rider> riders;
    private List<Horse> horses;

    public Stable(){

    }

    //characteristic 0: anfänger, 1: gute reiter, 2:sehr gute reiter
    public void example1(){
        Horse alex = new Horse("Alex", 0);
        Horse nicki = new Horse("Nicki", 2);
        Horse pucki = new Horse("Pucki", 0);
        Horse wittchen = new Horse("Wittchen", 0);
        Horse hurrikan = new Horse("Hurrikan", 1);
        Horse tornado = new Horse("Tornado", 2);
        Horse sturmwind = new Horse("Sturmwind", 1);
        Horse zausel = new Horse("Zausel", 0);
        Horse zackzack = new Horse("Zackzack", 2);
        HashSet<Horse> allhorses = new HashSet<>(Arrays.asList(alex, nicki, pucki, wittchen, hurrikan, tornado, sturmwind, zausel, zackzack));
  
        Rider anja = new Rider("Anja", 0, new HashSet<>(Arrays.asList(nicki, pucki, wittchen, alex)));
        Rider bertram = new Rider("Bertram", 1, allhorses);
        Rider christa = new Rider("Christa", 2, new HashSet<>(Arrays.asList(hurrikan)));
        Rider doris = new Rider("Doris", 0, new HashSet<>(Arrays.asList(pucki, wittchen, alex)));
        Rider emil = new Rider("Emil", 0, allhorses);
        Rider fritz = new Rider("Fritz", 2, new HashSet<>(Arrays.asList(sturmwind, hurrikan)));
        Rider gabi = new Rider("Gabi", 1, new HashSet<>(Arrays.asList(hurrikan, sturmwind, tornado, alex)));
    }

}
