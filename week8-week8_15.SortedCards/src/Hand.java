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
public class Hand implements Comparable<Hand>{
    private ArrayList <Card> cards = new ArrayList<Card>();
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card c : cards)
            System.out.println(c);
    }
    
   
    
    @Override
    public int compareTo(Hand h){
        int sum1 = 0;
        for (Card card : h.cards){
            sum1 += card.getValue();
        }
        
        int sum2 = 0;
        for (Card card : this.cards){
            sum2 += card.getValue();
        }
        
        return sum2 - sum1;
}
    public void sort() {
        Collections.sort(this.cards);
}
    
    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
         Collections.sort(this.cards, suitSorter);
}
   
  
}

