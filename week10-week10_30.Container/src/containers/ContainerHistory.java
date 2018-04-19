/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;
import java.util.*;

/**
 *
 * @author Nishant
 */
public class ContainerHistory {
    private List<Double> history;
    
    public ContainerHistory(){
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.history.add(situation);
    }
    
    
    public void reset(){
        this.history.clear();
    }
    
    @Override
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        
        if(this.history.isEmpty())
            return 0;
        
        double max = this.history.get(0);
        for(double val : this.history){
            if(val > max){
                max = val;
            }
        }
        return max;
    }
    
    
    public double minValue(){
        
        if(this.history.isEmpty())
            return 0;
        double min = this.history.get(0);
        for(double val : this.history){
            if(val < min){
                min = val;
            }
        }
        return min;
    }
    
    public double average(){
        
        if(this.history.isEmpty())
            return 0;
        
        double sum = 0;
        for(double item : this.history)
            sum += item;
        double avg = sum/this.history.size();
        return avg;
    }
    
    public double greatestFluctuation(){
        double maxfluctuation = 0;
        List <Double> fluctuations = new ArrayList<Double>();
        
        if(this.history.isEmpty() || this.history.size() == 1)
                return 0;
        else{ 
        for(int i = 0 ; i < this.history.size() - 1 ; i++){
            double firstnum = this.history.get(i);
            double secondnum = this.history.get(i + 1);
            maxfluctuation = Math.abs((secondnum) - (firstnum));
            fluctuations.add(maxfluctuation);
            
      
            }
        
        }
            
            return Collections.max(fluctuations);
        }
        
        
    
    public double variance(){
        if(this.history.isEmpty() || this.history.size() == 1)
            return 0;
        double av = average();
        double sos = 0;
        
        for(double d : this.history){
            sos += Math.pow((d - av), 2);
        }
        
        double var = sos/ (this.history.size()- 1);
        return var;
        
    }
    
}
