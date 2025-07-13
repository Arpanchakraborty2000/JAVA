class A {
    public void show1(){
        System.out.println("this is A");
    }
}

class B extends A {
    public void show2(){
        System.out.println("this is b");
    }
}

public class code {
    public static void main(String[] args) {

        double d = 4.5;
        int n = (int) d; // type casting 
        System.out.println(n); // only print 4 bcz it convert to int 

        System.out.println();
        

        // Upcasting  - >  it refer to parent class 
        A obj =(A)new B();
        obj.show1();

        System.out.println();

        // Downcasting -> it will refer to parent -> child 
        B obj1 = (B)obj;
        obj1.show2();








    }
}
