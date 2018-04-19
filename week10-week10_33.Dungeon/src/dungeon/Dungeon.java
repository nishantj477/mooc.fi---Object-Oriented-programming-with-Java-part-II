/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Nishant
 */
public class Dungeon {
    private int length, height, vampires, moves;
    boolean bool;
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.moves = moves;
        this.vampires = vampires;
        this.bool = vampiresMove;
    }
    
    void run(){
        
    }
    
    
}
