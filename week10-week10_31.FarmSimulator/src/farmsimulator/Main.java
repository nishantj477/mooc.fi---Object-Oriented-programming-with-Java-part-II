package farmsimulator;

public class Main {
    public static void main(String[] args) {
        // Test your program here
        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);
        
        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);
        
        Cow cow = new Cow();
        System.out.println(cow);
        
        Alive livingcow = cow;
        livingcow.liveHour();
        livingcow.liveHour();
        livingcow.liveHour();
        System.out.println(cow);
        
        Milkable milking = cow;
        milking.milk();
        System.out.println(cow);
        
    }
}
