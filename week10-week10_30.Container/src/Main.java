import containers.Container;
import containers.ProductContainer;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000);
        
        juice.addToTheContainer(1.0);
        System.out.println(juice);
        
        //System.out.println(juice.history());
        juice.printAnalysis();
       
    }

}
