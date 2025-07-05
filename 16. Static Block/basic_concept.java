class Mobile {
    String brand;
    int price;
    static String name; // like it declare the common for every object if i chance this it will affect
                        // both obj 1 and obj 2 ...

    static{
        name = "PHONE";
        System.out.println("in static block");
    }
    public Mobile(){
        brand =" ";
        price = 1500;
        System.out.println("in constructor ");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class basic_concept {
    public static void main(String[] args) throws Exception {

        Class.forName("Mobile");

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 100000;
        // obj1.name = "iPhone";

        
        // obj1.show();
        
    }
}
