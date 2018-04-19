/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.*;
public class Dictionary {
    private HashMap<String,String> translation = new HashMap<String, String>();
    
    public String translate(String word){
        if(this.translation.containsKey(word))
            return this.translation.get(word);
        else
            return null;
    }
    public void add(String word, String translation){
        if(!this.translation.containsKey(word))
                this.translation.put(word, translation);
        
    }
    
    public int amountOfWords(){
        return this.translation.size();
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> wordpairs = new ArrayList<String>();
        for ( String key : this.translation.keySet() ) {
                String t = key + " = " + this.translation.get(key);
                wordpairs.add(t);
    }
        return wordpairs;
}
}
