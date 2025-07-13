class Animal {

    public void show() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void show() {
        System.out.println("Dog barks");
    }

}

class Cat extends Animal{
    public void show() {
        System.out.println("Cat meows");
    }

}

public class code {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.show();  //  print  animal  class show

        a = new Dog();
        a.show(); //  print  Dog  class show

        a = new Cat();
        a.show(); //  print  Cat  class show

    }
    
    


}
