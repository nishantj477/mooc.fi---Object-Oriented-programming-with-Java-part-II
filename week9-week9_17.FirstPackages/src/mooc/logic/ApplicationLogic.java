/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logic;
import mooc.ui.UserInterface;

/**
 *
 * @author Nishant
 */
public class ApplicationLogic {
    private UserInterface u;
    public ApplicationLogic(UserInterface ui){
        u = ui;    
    }
    
    public void execute(int howManyTimes){
        int i = 1;
        while(i <= howManyTimes){
            System.out.println("The application logic works");
           u.update();
            i++;
        }
    }
}
