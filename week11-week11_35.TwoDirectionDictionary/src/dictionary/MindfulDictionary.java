/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.*;
import java.io.*;
/**
 *
 * @author Nishant
 */
public class MindfulDictionary {
    private Map<String, String> dictonary = new HashMap<String, String>();
    private File f;
    private Scanner reader;
    private String file;
    
    
    public MindfulDictionary(){}
    
    
    
    public void add(String word, String translation){
        if(!this.dictonary.containsKey(word))
            this.dictonary.put(word, translation);
    }
    
    public String translate(String word){
        
        
        
         if(this.dictonary.containsKey(word))
            return this.dictonary.get(word);
        else{
            for(String key : this.dictonary.keySet()){
                if(this.dictonary.get(key).equals(word))
                    return key;
            }
        }
         return null;
    }
    
    public MindfulDictionary(String file) throws Exception{
        this.file = file;
       }
        
    
    public boolean load() {
        
        try{
        f = new File(this.file);
        reader = new Scanner(f);
            while(reader.hasNextLine()){
            String line = reader.nextLine();
            String words[] = line.split(":");
            this.add(words[0], words[1]);
        }
            reader.close();
            return true;
        }catch (IOException ex){
            return false;
        }
    }
    
    
    public boolean save() {
        try{
        FileWriter writer = new FileWriter(this.file);
        
        for(String key : this.dictonary.keySet()){
            writer.write(key + ":" + this.dictonary.get(key) + "\n");
        }
        writer.close();
        return true;
    }catch(IOException ex){
        return false;
    }
    }
    
    public void remove(String word){
        
        
        if(this.dictonary.containsKey(word)){
                this.dictonary.remove(word);
        }
            if(this.dictonary.containsValue(word)){
                List<String> keys = new ArrayList<String>();
                for(String key : this.dictonary.keySet()){
                    if(this.dictonary.get(key).equals(word))
                        keys.add(key);
                }
                for(String k : keys)
                    this.dictonary.remove(k);
            }
            
        }
}
    
    
        

