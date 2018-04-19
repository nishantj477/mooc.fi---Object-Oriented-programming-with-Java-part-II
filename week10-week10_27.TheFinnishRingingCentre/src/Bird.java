
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object ob){
        if(ob == null)
            return false;
        if(this.getClass()!= ob.getClass())
            return false;
        Bird other = (Bird) ob;
        return ((this.latinName.equals(other.latinName)) && (this.ringingYear == other.ringingYear));
            }
    
    @Override
    public int hashCode(){
        return this.ringingYear * this.latinName.hashCode();
    }
}


