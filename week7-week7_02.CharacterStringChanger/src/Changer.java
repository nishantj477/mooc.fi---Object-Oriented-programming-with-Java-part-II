
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.ArrayList;
public class Changer {
    ArrayList<Change> changes = new ArrayList<Change>();
    public Changer(){
    }
    
    public void addChange(Change change){
        changes.add(change);
    }
    
    public String change(String characterString){
      for(Change c : changes){
          characterString = c.change(characterString);
      }
      return characterString;
    }
}

    