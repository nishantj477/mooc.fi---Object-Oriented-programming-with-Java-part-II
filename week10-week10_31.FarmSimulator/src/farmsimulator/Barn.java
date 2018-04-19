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
public class Barn {
    
    private BulkTank btank = new BulkTank();
    private MilkingRobot mrobot = new MilkingRobot();
    
    public Barn(BulkTank tank){
        this.btank = tank;
        mrobot = null;
    }
    
    public BulkTank getBulkTank(){
        return this.btank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.mrobot = milkingRobot;
        this.mrobot.setBulkTank(btank);
        
    }
    
    public void takeCareOf(Cow cow){
        try{
        this.mrobot.milk(cow);
        } catch(Exception e){
            throw new IllegalStateException();
        }
    }
        
        public void takeCareOf(Collection<Cow> cows){
            for(Cow c : cows){
                  this.takeCareOf(c);
            }
        }
           
    @Override
        public String toString(){
            return Math.ceil(this.btank.getVolume()) + "/"
                    + Math.ceil(this.btank.getCapacity());
        }
}
