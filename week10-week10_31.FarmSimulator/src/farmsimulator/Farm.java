/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.*;
/**
 *
 * @author Nishant
 */
public class Farm implements Alive{
    
    private String owner;
    private Barn barn;
    private List<Cow> cowsInBarn;
    
    public Farm(String ownerName, Barn barn){
        this.owner = ownerName;
        this.barn = barn;
        this.cowsInBarn = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    @Override
    public void liveHour(){
        for(Cow c : this.cowsInBarn)
                c.liveHour();
    }
    
    public void manageCows(){
        this.barn.takeCareOf(cowsInBarn);
    }
    
    public void addCow(Cow cow){
        this.cowsInBarn.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        this.barn.installMilkingRobot(robot);
    }
    
    @Override
    public String toString(){
        String title = "Farm owner: " + this.getOwner() + "\n"
                + "Barn bulk tank: " + this.barn.toString() + "\n"
                + "Animals: " + "\n";
        for(Cow c : this.cowsInBarn){
            title += "        " + c.toString() + "\n";
        }
        return title;
    }
    
    
}

