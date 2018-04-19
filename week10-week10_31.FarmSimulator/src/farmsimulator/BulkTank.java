/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Nishant
 */
public class BulkTank {
    
    private double volume;
    private double capacity;
    
    public BulkTank(){
    this.capacity = 2000;
    this.volume = 0;
    }
    
    public BulkTank(double capacity){
        this.capacity = capacity;
        this.volume = 0;
    }
    
    public double getCapacity(){
       return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount){
        if(this.howMuchFreeSpace() >= amount){
            this.volume += amount;
        }
        
        else{
            this.volume += this.howMuchFreeSpace();
        }
    }
        
        public double getFromTank(double amount){
            double volume_taken = 0;
            
            if(this.getVolume() <= amount){
                volume_taken = this.getVolume();
                this.volume = 0 ;
        }
            else{
                this.volume -= amount;
                volume_taken = amount;
            }
            return volume_taken;
            
    }
        
    @Override
        public String toString(){
            return Math.ceil(this.getVolume()) +"/" + Math.ceil(this.getCapacity());
        }
    
}
