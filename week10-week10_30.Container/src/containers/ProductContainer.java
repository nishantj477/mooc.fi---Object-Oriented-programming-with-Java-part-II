/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Nishant
 */
public class ProductContainer extends Container{
    private String pname;
    
    public ProductContainer(String productName, double capacity){
     super(capacity);
     this.pname = productName;
    }
    
    public String getName(){
        return this.pname;
    }
    
    public void setName(String newName){
        this.pname = newName;
    }
    
    @Override
    public String toString(){
        return this.getName() + ": volume = " + this.getVolume() + ", free space " + getCurrentCapacity();
    }
}
