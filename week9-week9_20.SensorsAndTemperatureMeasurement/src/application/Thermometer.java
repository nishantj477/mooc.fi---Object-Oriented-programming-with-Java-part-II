/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.Random;


/**
 *
 * @author Nishant
 */
public class Thermometer implements Sensor{
    private boolean status = false;
    @Override
    public boolean isOn(){
        return status;
    }
    
    @Override
    public int measure(){
        int n;
        if(isOn()){
        Random rand = new Random();
        n = rand.nextInt(30 - (-30) + 1) - 30;
        return n;
    }
        else
            throw new IllegalStateException("Thermo is off");
    
    }
    
    @Override
    public void on(){
       this.status = true;
     }
    
    @Override
    public void off(){
        this.status = false;
    }
    
    
}
