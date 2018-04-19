/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.*;
/**
 *
 * @author Nishant
 */
public class Group implements Movable{
    private List<Movable> organisms;
    
    public Group(){
        this.organisms = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable){
        this.organisms.add(movable);
    }
    
   
    @Override
    public String toString(){
        String print = "";
        for(Movable m : this.organisms){
                print += m.toString()+"\n";
               
        }
        
        return print;
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable m : this.organisms)
                m.move(dx, dy);
    }
    
}
