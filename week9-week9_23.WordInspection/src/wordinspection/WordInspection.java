/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;
import java.io.*;
import java.util.*;
/**
 *
 * @author Nishant
 */
public class WordInspection{
    private File file;
    private Scanner reader;
    
    public WordInspection(File file) throws Exception{
        this.file = file;
        reader = new Scanner(this.file);
    }
    
    public int wordCount(){
        int word_count = 0;
        while(reader.hasNextLine()){
            String s = reader.nextLine();
            word_count += 1;
        }
        return word_count;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        List <String> wordsContainingZ = new ArrayList<String>();
       
        Scanner reader1 = new Scanner(this.file, "UTF-8");
        while(reader1.hasNextLine()){
            String s1 = reader1.nextLine();
            if(s1.contains("z"))
                wordsContainingZ.add(s1);
        }
        return wordsContainingZ;
    }
    
    public List<String> wordsEndingInL()throws Exception{
        List <String> wordsEndingInL = new ArrayList<String>();
        String l = "l";
        
        Scanner reader2 = new Scanner(this.file, "UTF-8");
        while(reader2.hasNextLine()){
            String s2 = reader2.nextLine();
            if(s2.endsWith(l))
                wordsEndingInL.add(s2);
        }
        reader2.close();
        return wordsEndingInL;
        
    }
    
    
    public List<String> palindromes()throws Exception{
        List<String> palindromes = new ArrayList<String>();
        
        Scanner reader3 = new Scanner(this.file, "UTF-8");
        
        while(reader3.hasNextLine()){
            String s3 = reader3.nextLine();
            StringBuilder sb = new StringBuilder(s3);
            sb.reverse();
            String palin = sb.toString();
            if(s3.equalsIgnoreCase(palin))
                palindromes.add(s3);
        }
        reader3.close();
        return palindromes;
    
    }

    
    
     public List<String> wordsWhichContainAllVowels() throws Exception{
         List<String> vowels = new ArrayList<String>();
        
        Scanner reader4 = new Scanner(this.file, "UTF-8");
        
        while(reader4.hasNextLine()){
            String s3 = reader4.nextLine();
            if(s3.contains("a") && s3.contains("e") && s3.contains("i") && s3.contains("o")
                    && s3.contains("y") && s3.contains("u") && s3.contains("ä") && s3.contains("ö"))
                
                vowels.add(s3);
                
                }
        reader.close();
        return vowels;
     }
}

       

