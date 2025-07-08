
class employee {
    private int id;
    private String name;

    // constructor creation in java
    // Default constructor 
    public employee() { // method overloding 
        id = 25;
        name = "arpan";
    }

    // different type value passed by constructor
    // paramitarized construtor 
    public employee(int i, String n) {  // method overloding 
        id = 1; 
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class basic_concept {
    public static void main(String[] args) {

        // employee e =new employee();

        employee e = new employee(1, "Arpan");
        employee p = new employee();

        System.out.println(e.getId());
        System.out.println(e.getName());

        System.out.println(p.getId());
        System.out.println(p.getName());
    }
}
