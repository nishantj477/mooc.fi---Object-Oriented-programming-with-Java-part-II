public class Main {
    public static void main(String[] args) {
        // Test your code here!
        CivilService cs1 = new CivilService();
        int d = cs1.getDaysLeft();
        System.out.println(d);
        cs1.work();
        int d1 = cs1.getDaysLeft();
        System.out.println(d1);
        
        MilitaryService ms1 = new MilitaryService(200);
        int m1 = ms1.getDaysLeft();
        System.out.println(m1);
        
        ms1.work();
        int m2 = ms1.getDaysLeft();
        System.out.println(m2);
    }
}
