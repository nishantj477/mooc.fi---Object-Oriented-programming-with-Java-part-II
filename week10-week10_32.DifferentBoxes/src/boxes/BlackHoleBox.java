/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.*;
/**
 *
 * @author Nishant
 */
public class BlackHoleBox extends Box{
    
    private List<Thing> everything ;
    
    public BlackHoleBox(){
        this.everything = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing){
        this.everything.add(thing);
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        return false;
    }
}
