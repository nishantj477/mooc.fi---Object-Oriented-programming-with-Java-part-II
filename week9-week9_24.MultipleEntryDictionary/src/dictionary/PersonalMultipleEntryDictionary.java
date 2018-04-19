/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
/**
 *
 * @author Nishant
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> pairs = new HashMap<String, Set<String>>();
    
    @Override
    public void add(String word, String entry){
        if(!this.pairs.containsKey(word))
            this.pairs.put(word, new HashSet<String>());
        
        Set<String> trans = this.pairs.get(word);
        trans.add(entry);
        
        
    }
    
    @Override
    public Set<String> translate(String word){
        Set<String> equi = new HashSet<String>();
         if(this.pairs.containsKey(word)){
               equi = (this.pairs.get(word));
               return equi;
         }
         else
             return null;
         
        
    }
    
    @Override
    public void remove(String word){
        if(this.pairs.containsKey(word))
            this.pairs.remove(word);
    }
}
