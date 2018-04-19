/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.Scanner;
public class Reader {
    private Scanner reader = new Scanner(System.in);
    
    public String readString(){
        String stg = reader.nextLine();
        return stg;
    }
    public int readInteger(){
        int i = Integer.parseInt(reader.nextLine());
        return i;
    }
}
