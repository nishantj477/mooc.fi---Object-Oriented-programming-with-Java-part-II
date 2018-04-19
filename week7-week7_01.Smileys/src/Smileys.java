
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Arto");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("\\:D/");
        printWithSmileys("nis");
    }
    
    private static void printWithSmileys(String characterString){
        
        if(characterString.length() == 4){
            for (int i = 0 ; i < characterString.length() + 1 ; i++)
                System.out.print(":)");
            
            System.out.println();
            System.out.println(":) " + characterString + " :)");
            
            
            for (int j = 0 ; j < characterString.length() + 1 ; j++) 
                    System.out.print(":)");
            System.out.println();
        }
        
        
        else if (characterString.length() % 2 == 0){
            for (int i = 0 ; i < characterString.length() ; i++)
                System.out.print(":)");
            
            System.out.println();
            System.out.println(":) " + characterString + " :)");
            
            
            for (int j = 0 ; j < characterString.length() ; j++) 
                    System.out.print(":)");
            System.out.println();
        }
        else
        {
            characterString +=" ";
            for (int i = 0 ; i < characterString.length() ; i++)
                System.out.print(":)");
            
            System.out.println();
            System.out.println(":) " + characterString + " :)");
            
            for (int j = 0 ; j < characterString.length() ; j++)
                System.out.print(":)");
            System.out.println();
            
         
    }
                }
}
