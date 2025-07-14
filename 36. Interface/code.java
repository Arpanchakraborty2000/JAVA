interface A {

    int age =  24 ;      // it always final and static only 
    String classname = "Five";
    void show();

    void config();

}

class B implements A {

    @Override
    public void show() {
        System.out.println("It is showing");
    }

    @Override
    public void config() {
        System.out.println("It is config ");
    }

}

public class code {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.config();

        

        System.out.println(A.age);
        System.out.println(A.classname);

    }

}
