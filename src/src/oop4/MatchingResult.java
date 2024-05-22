package oop4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingResult{
    private int score;
    private Map<Rider, Horse> map;

    public MatchingResult(){
        map = new HashMap<>();
        score=0;
    }

    public int getScore(){
        return this.score;
    }

    public void increaseScore(){
        score++;
    }

    public Map<Rider, Horse> getMap(){
        return this.map;
    }

    public void setMap(Map<Rider, Horse> map){
        this.map=map;
    }

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