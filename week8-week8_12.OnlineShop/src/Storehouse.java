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
public class Storehouse {
    
    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();
    
  
    
    public void addProduct(String product, int price, int stock){
        
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
           if(this.prices.keySet().contains(product))
               return this.prices.get(product);
           else
               return -99;
            
    }
    
    public int stock(String product){
        if(this.stocks.containsKey(product))
            return this.stocks.get(product);
        else
            return 0;
    }
    
    public boolean take(String product){
        if(this.stocks.containsKey(product) && this.stocks.get(product) > 0){
            this.stocks.put(product, this.stocks.get(product) - 1);
        return true;
    }
        else
            return false;
}
    
    public Set<String> products(){
        Set<String> names = new HashSet<String>();
        for(String name : prices.keySet())
            names.add(name);
        return names;
            
    }
}

