public class method_overloading {
    static void foo(){
        System.out.println("Arpan.");
    }
    static void foo(int a){
        System.out.println("Arpan age is: "+a);
    }
    public static void main(String[] args) {

        // for method overloading both are same name but differ arguments in this function

        // but its only work same return type like void- void / int - int ----> not work fot int/void or different
        foo();
        foo(25);
    }
}
