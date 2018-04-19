/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class Change {
    char o ;
    char r;
    public Change(char fromCharacter, char toCharacter){
        this.o = fromCharacter;
        this.r = toCharacter;
    }
    
    public String change(String characterString){
        String replaced = "";
        
  for ( int i=0; i < characterString.length(); i++) {
     char character = characterString.charAt(i);
     if ( character == this.o ) {
        replaced += this.r;
     }  else {
        replaced += character;
     }
  }
  return replaced;
    }
}
