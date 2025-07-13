abstract class A {
    public abstract void show();
    public abstract void config();
    
}

public class code {
    public static void main(String[] args) {
        A obj= new A() {

            @Override
            public void show() {
                System.out.println("SHOW");
            }

            @Override
            public void config() {
                System.out.println("CONFIG");
            }
            
        };

        obj.show();
        obj.config();
    }
}
