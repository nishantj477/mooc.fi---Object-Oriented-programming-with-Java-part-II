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
public class RingingCentre {
    
    private Map<Bird, List<String>> birds;
    
    public RingingCentre(){
        birds = new HashMap<Bird, List<String>>();  
    }
    
    public void observe(Bird bird, String place){
        List<String> places = new ArrayList<String>();
        if(!this.birds.keySet().contains(bird)){
            places.add(place);
            birds.put(bird, places);
        }
        
        else{
            places = birds.get(bird);
            places.add(place);
            birds.put(bird, places);
        }
    }
        
        public void observations(Bird bird){
            
            if(birds.get(bird) == null){
                System.out.println(bird.toString() + " observations: " + 0);
            }
            else{
                System.out.println(bird.toString() + " observations: " + birds.get(bird).size());
                for(String s : birds.get(bird))
                    System.out.println(s);
            }
            
                
        }
    }
    

