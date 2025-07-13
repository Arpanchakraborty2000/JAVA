
class A {

    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B { // sattic only use in inner class
        public void config() {
            System.out.println("in config");
        }
    }
}

public class code {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B obj1 = new A.B(); // always call inner class with use this syntax
        obj1.config();

    }
}
