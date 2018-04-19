/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.*;

/**
 *
 * @author Nishant
 */

public class Analysis {
    private Scanner reader;
    private File f;
    
    
    
    public Analysis(File file) throws Exception{
        this.f = file;
    }
    
    public int lines() throws Exception{
        int line_count = 0;
        
        reader = new Scanner(f);
        while(reader.hasNextLine()){
            line_count++;
            String s = reader.nextLine();
            
        }
        
        reader.close();    
        return line_count;
        
    }
    
    
   public int characters() throws Exception{
      Scanner reader1 = new Scanner(f);
      String all_lines = "";
      while(reader1.hasNextLine()){
            String s1 = reader1.nextLine();
            all_lines += s1 + "\n";
        }
      reader1.close();
      return all_lines.length();
       
   }
}
