class A {

    public A() {
        System.out.println("its construtor print ");
    }

    public void show() {
        System.out.println("is A show ");
    }

}

public class basic_concept {
    public static void main(String[] args) {

        new A(); // this only print the constructor value

        new A().show(); // Anonymous object
        // it will show both A and show but its not reusbale

        new A().show(); // aagain create a object jus random

    }
}
