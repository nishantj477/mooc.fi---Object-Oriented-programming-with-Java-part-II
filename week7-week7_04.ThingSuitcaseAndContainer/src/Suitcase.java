/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.ArrayList;
public class Suitcase {
    private int maxweight;
    private int totalweight = 0;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    
    public Suitcase(int maxweight){
        this.maxweight = maxweight;
    }
    
    public void addThing(Thing thing){    
        if (this.maxweight - thing.getWeight() >= 0) {
                things.add(thing);
                this.totalweight += thing.getWeight();
                this.maxweight = this.maxweight - thing.getWeight();
    }
    }
    
    @Override
    public String toString(){
        if(things.size() == 0)
           return ("empty" + " (" + this.totalweight + " kg)");
        else if(things.size() == 1)
            return ("1 thing" + " (" + this.totalweight + " kg)"); 
        else
            return (things.size() + " things" + " (" + this.totalweight + " kg)");
    }
    
    public void printThings(){
        for(Thing t: things)
            System.out.println(t.getName() + " (" + t.getWeight() + " kg)");
    }
     
    public int totalWeight(){
        return this.totalweight;
}
    public Thing heaviestThing(){
        Thing h;
        if(things.size() == 0)
            h = null;
        else{
            h = things.get(0);
            for(Thing t:things){
                if (t.getWeight() > h.getWeight())
                    h = t;
        }
        }
        return h;
    }
}
