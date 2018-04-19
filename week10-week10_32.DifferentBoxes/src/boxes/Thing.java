package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        if(weight >= 0){
        this.weight = weight;
    }
        else{
            throw new IllegalArgumentException();
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        
        Thing other = (Thing) obj;
        
        
        if(!this.getName().equals(other.getName()))
            return false;
        
        return true;

}
    
    @Override
    public int hashCode(){
        int hash = 5 ;
        hash += 4 + this.getName().hashCode();
        return hash;
    }
}
