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
public class Cow implements Milkable, Alive{
    private String cname;
    private double udder;
    private double MilkAmount;
    private Random random = new Random();
    
    private String[] NAMES = new String[]{
        "Anu", "Arpa", "Bebo", "Carli", "Drimi"};

    
    public Cow(){
        this.cname = NAMES[random.nextInt(NAMES.length)];
        this.udder = 15 + new Random().nextInt(40-15+1);
        this.MilkAmount = 0;
    }
    
    public Cow(String name){
        this.cname = name;
        this.udder = 15 + new Random().nextInt(40-15+1);
        this.MilkAmount = 0;
    }
    
    public String getName(){
        return this.cname;
    }
    
    public double getCapacity(){
        return this.udder;
    }
    
    public double getAmount(){
        return this.MilkAmount;
    }
    
    @Override
    public String toString(){
        return this.getName() + " " + Math.ceil(this.getAmount()) + "/" + Math.ceil(getCapacity());
    }
    
    @Override
    public void liveHour(){
        this.MilkAmount += (7 + random.nextInt(20-7+1)) / 10.0;
        if(this.getAmount() > this.getCapacity())
            this.MilkAmount = this.udder;
    }
    
    @Override
    public double milk(){
        double milk_taken = this.getAmount();
        this.MilkAmount = 0;
        return milk_taken;
    }
    
    
}
