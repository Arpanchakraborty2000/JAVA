class A {
    public void show(){
        System.out.println("IS A CLASS");
    }
    
}

public class code {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("IS NEW INNER CLASS");
            } // Anonymous inner class
        };

        obj.show();
    }
}
