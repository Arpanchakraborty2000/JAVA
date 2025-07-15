@FunctionalInterface
interface A {

    // void show(int i, int j );
    void show(int i);
}

public class code {
    public static void main(String[] args) {
        // this is lamda expression syntax -> 
       // A obj = (i,j) -> System.out.println("Arpan Chakraborty  "+i+" "+j); // thsi is taking multiple var5ibale 
        A obj2 = i -> System.out.println("Arpan Chakraborty  "+ i); // if you have only one varible you not need the bracket also 
       // obj.show(5,20);

       obj2.show(10);
    }
}
