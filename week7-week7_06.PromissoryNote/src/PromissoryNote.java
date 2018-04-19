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
public class PromissoryNote {
    private HashMap<String, Double> creditors = new HashMap<String, Double>();
    public PromissoryNote(){
    }
    
    public void setLoan(String toWhom, double value){
        this.creditors.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.creditors.containsKey(whose))
             return this.creditors.get(whose);
        else
            return 0;
    }
    
}
