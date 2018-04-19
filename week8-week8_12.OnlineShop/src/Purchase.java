/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class Purchase {
   private String product;
   private int amount;
   private int unitPrice;
   
    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    
  
    
    public void increaseAmount(){
        this.amount += 1;
    }
    
      public int price(){
        return this.amount * this.unitPrice;
    }
    
   @Override
    public String toString(){
        return this.product + ": " + this.amount;
    }
    
    public String name(){
        return this.product;
    }
   
}
