package oop4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/**
 * The Stable class represents a stable containing a list of riders and horses.
 * It provides methods to populate the stable with default data and to retrieve the lists of riders and horses.
 */

public class Stable {
    /**
     * A list of riders in the stable.
     */
    private List<Rider> riders;
    /**
     * A list of horses in the stable.
     */
    private List<Horse> horses;

    /**
     * Constructs a new Stable instance and populates it with the original default data.
     */
    public Stable(){
        riders = new ArrayList<>();
        horses = new ArrayList<>();
        fillStableOriginal();
    }
    public void fillStablev2(){
        Horse alex = new Horse("Alex", 2);
        Horse nicki = new Horse("Nicki", 1);
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

        riders.add(anja);
        riders.add(bertram);
        riders.add(christa);
        riders.add(doris);
        riders.add(emil);
        riders.add(fritz);
        riders.add(gabi);

        horses.add(alex);
        horses.add(nicki);
        horses.add(pucki);
        horses.add(wittchen);
        horses.add(hurrikan);
        horses.add(tornado);
        horses.add(sturmwind);
        horses.add(zausel);
        horses.add(zackzack);
    }
    /**
     * Populates the stable with the original default set of riders and horses.
     */

    //characteristic: 0: anfänger, 1: gute reiter, 2: sehr gute reiter
    public void fillStableOriginal(){
        Horse alex = new Horse("Alex", 0);
        Horse nicki = new Horse("Nicki", 1);
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

        riders.add(anja);
        riders.add(bertram);
        riders.add(christa);
        riders.add(doris);
        riders.add(emil);
        riders.add(fritz);
        riders.add(gabi);

        horses.add(alex);
        horses.add(nicki);
        horses.add(pucki);
        horses.add(wittchen);
        horses.add(hurrikan);
        horses.add(tornado);
        horses.add(sturmwind);
        horses.add(zausel);
        horses.add(zackzack);
    }

    /**
     * Gets the list of riders in the stable.
     *
     * @return A list of riders.
     */
    public List<Rider> getRiders(){
        return this.riders;
    }
    /**
     * Gets the list of horses in the stable.
     *
     * @return A list of horses.
     */
    public List<Horse> getHorses(){
        return this.horses;
    }

}
