interface Computer {

    void code();
}

class Laptop implements Computer {

    @Override
    public void code() {
       System.out.println("Its laptop code ");
    }

}

class Desktop implements Computer{

    @Override
    public void code() {
        System.out.println("Its desktop code ");
    }

}
 class Developer {

    public void Devapp(Computer a){
        a.code();
    }
    
}

public class code {
    public static void main(String[] args) {

        Computer a = new Laptop();
        Computer b = new Desktop();

        Developer arpan = new Developer();
        arpan.Devapp(a);
        arpan.Devapp(b);

    }
}
