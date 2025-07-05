class Mobile {
    String brand;
    int price;
    static String name; // like it declare the common for every object if i chance this it will affect
                        // both obj 1 and obj 2 ...

    // public void show() {
    //     System.out.println(brand + " : " + price + " : " + name);

    // }

    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name); // the non static variable cannot work inside
                                                                          // a static method.
        // as we know we already declare the name is a static variable , thats why no
        // need to identify this .
    }
}

public class basic_concept {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        obj1.name = "iPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 200000;
        obj2.name = "Android";

        obj1.name = "OPPO"; // change the value it will affect all

        // obj1.show();
        // obj2.show();

        Mobile.show1(obj1);
        Mobile.show1(obj2);
    }
}
