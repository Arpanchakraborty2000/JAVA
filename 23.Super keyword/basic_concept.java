// super(); -> it will always refer the base class value 

class A {
    public A() {
        super();
        System.out.println("it is normal constructor");
    }

    public A(int n) {
        super();
        System.out.println("it is paramitarized constructor");
    }
}

class B extends A {
    public B() { // default example 
        super();
        System.out.println("it is normal constructor");
    }

    // public B() {
    //         super(5); // also passed parameter 
    //         System.out.println("it is normal constructor");
    //     }

    public B(int n) {
        super(n); // it super you pased parameter so thats why it will automatically selete parent
                  // class / super class paramitarized contructor ....
        System.out.println("it is paramitarized constructor");
    }
}

public class basic_concept {
    public static void main(String[] args) {

        B obj = new B(); // if you not passed parameter it will print default constructor
        B obj1 = new B(10); // it will call paramitarised constructor

        System.out.println();
        System.out.println();

        B obj3 = new B(10);

    }
}
