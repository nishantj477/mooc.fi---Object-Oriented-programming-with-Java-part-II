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
public class MaxWeightBox extends Box{
    
    private int mWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.mWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int tWeight = 0;
        for(Thing t : this.things){
            tWeight += t.getWeight();
        }
        if(tWeight + thing.getWeight() <= this.mWeight){
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.things.contains(thing);
    }
    
}
