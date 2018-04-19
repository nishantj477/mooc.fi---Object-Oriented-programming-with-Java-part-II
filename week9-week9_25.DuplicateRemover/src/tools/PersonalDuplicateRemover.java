/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;
import java.util.*;
/**
 *
 * @author Nishant
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private List <String> words;
    private int dup;
    public PersonalDuplicateRemover(){
        this.dup = 0;
        this.words = new ArrayList<String>();
    }
    
    @Override
    public void add(String characterString){
        if(!this.words.contains(characterString))
            this.words.add(characterString);
        else
            dup++;
        
    }
    
    @Override
    public int getNumberOfDetectedDuplicates(){
        return this.dup;
    }
    
    @Override
    public Set<String> getUniqueCharacterStrings(){
        Set<String> unique = new HashSet<String>();
        for(String s: this.words)
            unique.add(s);
        return unique;
    }
    
    @Override
    public void empty(){
        this.words.clear();
        this.dup = 0;
    }
    
}
