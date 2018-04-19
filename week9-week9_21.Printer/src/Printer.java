import java.io.File;
import java.util.Scanner;

public class Printer {
    private Scanner reader = null;
    private File f;
    
    public Printer (String fileName) throws Exception{
      f = new File(fileName);
      reader = new Scanner(f);
    }
    
    public void printLinesWhichContain (String word) throws Exception{
        reader = new Scanner(f);
    while(reader.hasNextLine()){
        String line = reader.nextLine();
        
        if(line.contains(word))
            System.out.println(line);
    }
    
    reader.close();
        
    }
}