class A extends Thread { // this two method run parralay in same time
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread { // this two method run parralay in same time
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hellow");
        }
    }
}

public class multi_threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // on run of thread always use start instead funtion name 
        obj2.start();
    }
}
