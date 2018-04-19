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
public class OneThingBox extends Box{
    
    private List<Thing> othing;
    
    public OneThingBox(){
    this.othing = new ArrayList<Thing>();
    }
    
    
    
    @Override
    public void add(Thing thing) {
        if(this.othing.isEmpty())
            this.othing.add(thing);
    }
    
    
    
    @Override
    public boolean isInTheBox(Thing thing) {
        return this.othing.contains(thing);
    }
}
