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
public class Container {
    private int maxweight;
    private int totalweight = 0;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
    
    public  Container(int maxweight){
        this.maxweight = maxweight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (this.maxweight - suitcase.totalWeight() >=0){
                suitcases.add(suitcase);
                this.totalweight += suitcase.totalWeight();
                this.maxweight = this.maxweight - suitcase.totalWeight();
    }
    }
    
    @Override
    public String toString(){
        return ((suitcases.size()) + " suitcases (" + this.totalweight + "kg)"); 
    }
    
    public void printThings(){
        for(Suitcase s: suitcases){
            s.printThings();
        }
    }
}
