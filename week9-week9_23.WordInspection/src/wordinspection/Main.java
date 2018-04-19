package wordinspection;

import java.io.File;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        WordInspection wi = new WordInspection(file);
        System.out.println("Total no. of words: " + wi.wordCount());
        List <String> words = wi.wordsContainingZ();
            System.out.println(words);
            
        List <String> words1 = wi.wordsEndingInL();
        System.out.println(words1);
        
        List <String> pals = wi.palindromes();
        System.out.println(pals);
        
        List <String> vow = wi.wordsWhichContainAllVowels();
        System.out.println(vow);
    }   
}
