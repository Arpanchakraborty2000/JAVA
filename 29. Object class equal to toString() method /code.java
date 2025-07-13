 class Laptop {

    String model;
    int cost ;
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + cost;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (cost != other.cost)
            return false;
        return true;
    }

    // public String toString(){
    //     return model+" : "+cost;
    // }

    
}
public class code {
    public static void main(String[] args) {
        
        Laptop obj1 = new Laptop();

        obj1.model = "Apple";
        obj1.cost = 1000;

        Laptop obj2 = new Laptop();

        obj2.model = "Apple";
        obj2.cost = 1000;


        boolean result = obj1.equals(obj2);
        System.out.println(result);
        
    }
}
