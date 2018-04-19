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
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory ContainerH;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName, capacity);
        this.ContainerH = new ContainerHistory();
        this.addToTheContainer(initialVolume);
        //this.ContainerH.add(initialVolume);
        
    }
    
    public String history(){
        return this.ContainerH.toString();
    }
    
    @Override
    public void addToTheContainer(double amount){
        super.addToTheContainer(amount);
        this.ContainerH.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        double firstvol = this.getVolume();
        super.takeFromTheContainer(amount);
        this.ContainerH.add(this.getVolume());
        return firstvol - this.getVolume();
        
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + this.getName() + "\n"
        + "History: " + this.history() + "\n"
        + "Greatest product amount: " + this.ContainerH.maxValue() + "\n"
        + "Smallest product amount: " + this.ContainerH.minValue() + "\n"
        + "Average: " + this.ContainerH.average() + "\n"
        + "Greatest change: " + this.ContainerH.greatestFluctuation() + "\n"
        + "Variance: " + this.ContainerH.variance());
    }
    
}
