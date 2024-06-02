package oop4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The MatchingResult class represents the result of matching riders to horses.
 * It contains the matching pairs and a score indicating the number of successful matches.
 */
public class MatchingResult{
    /**
     * The score representing the number of successful matches.
     */
    private int score;
    /**
     * A map that holds the matching pairs of riders and horses.
     */
    private Map<Rider, Horse> map;
    /**
     * Constructs a new MatchingResult instance with an empty map and a score of 0.
     */

    public MatchingResult(){
        map = new HashMap<>();
        score=0;
    }

    /**
     * Gets the score representing the number of successful matches.
     *
     * @return The score.
     */
    public int getScore(){
        return this.score;
    }
    /**
     * Increases the score by 1 to indicate a successful match.
     */

    public void increaseScore(){
        score++;
    }

    /**
     * Gets the map containing the matching pairs of riders and horses.
     *
     * @return The map of matching pairs.
     */
    public Map<Rider, Horse> getMap(){
        return this.map;
    }
    /**
     * Sets the map containing the matching pairs of riders and horses.
     *
     * @param map The map to set.
     */

    public void setMap(Map<Rider, Horse> map){
        this.map=map;
    }

    /**
     * Returns a string representation of the matching result.
     * The string contains the matched pairs and the score.
     *
     * @return A string representation of the matching result.
     */
    @Override
    public String toString(){
        String sol="";

        for(Map.Entry<Rider, Horse> match : map.entrySet()){
            sol+=match.getKey().getName() + " -> " + match.getValue().getName() + "\n";
        }
        sol+="Anzahl erfüllter Wünsche: "+score;

        return sol;
    }


}