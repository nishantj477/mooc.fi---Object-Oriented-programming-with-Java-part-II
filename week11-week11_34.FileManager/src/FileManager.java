
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class FileManager {

    List<String> lines = new ArrayList<String>();
    
    
    public List<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner reader = new Scanner(f);
        
        if(f.exists()){
            while(reader.hasNextLine()){
                String s = reader.nextLine();
                this.lines.add(s);
            }
            reader.close();
            return this.lines;
        }
            else
            return null;
        }
            
 

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
        
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        for(String s : texts){
            writer.write(s + "\n");
        }
        writer.close();
    }
}
