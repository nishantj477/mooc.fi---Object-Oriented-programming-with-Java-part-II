/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class CD implements ToBeStored {
    String artist;
    String title;
    int publishing_year;
    double weigh;

    public  CD(String artist, String title, int year){
        this.artist = artist;
        this.title = title;
        this.publishing_year = year;
        this.weigh = 0.1;
    }
    
    
    @Override
    public double weight(){
        return this.weigh;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.title + " (" + this.publishing_year + ")";
    }

}
