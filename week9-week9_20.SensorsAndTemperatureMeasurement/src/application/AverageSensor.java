/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Nishant
 */
import java.util.*;
public class AverageSensor implements Sensor{
    private List<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();
    
    public void addSensor(Sensor additional){
        this.sensors.add(additional);
    }
    
    @Override
   public boolean isOn(){
       for (Sensor s : sensors) {
            if (!s.isOn()) {
                return false;
            }
        }
        return true;
}
    
    @Override
    public void on(){
        for(Sensor s : this.sensors)
            s.on();
    }
  
    @Override
    public void off(){
        for(Sensor s : this.sensors)
            s.off();
    }
    
    @Override
    public int measure(){
        int sum = 0;
        if(this.sensors.isEmpty() || !this.isOn())
                throw new IllegalStateException("Sensor is empty or off");
        else{
            for(Sensor s : this.sensors)
                sum += s.measure();
        }
        int avg = sum / this.sensors.size();
        this.readings.add(avg);
        return avg;
        
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
}
