/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.*;
public class TextUserInterface {
    private String input;
    private Dictionary dict;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        System.out.println("Statement:");
        System.out.println("  quit - quit the text user interface");
        System.out.print("Statement: ");
         this.input = reader.nextLine();
         this.dict= dictionary;
    }
    
    public void start(){
        if(this.input.equals("quit"))
            System.out.println("cheers!");
        else
            System.out.println("Unknown statement");
    }
}
