
 class A {
    public void show() throws ClassNotFoundException{
        Class.forName("cal");
    }
    
}
public class code {

    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            
            e.printStackTrace();
        };
    }
}
