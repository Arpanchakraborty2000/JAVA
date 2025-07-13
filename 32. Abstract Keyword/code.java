abstract class car {

    public abstract void drive(); 
    public abstract void fly();

    public void playmusic(){
        System.out.println("PLAY MUSIC");
    }
    
}
abstract class Waganor  extends car{
// when you extends the abstract class must inharite there functions 
    @Override
    public void drive() {
        System.out.println("DRIVE");
    }
    
}

class upgratedwaganor extends Waganor { // concrete class

    @Override
    public void fly() {

        System.out.println("FLY ");
    }

    
}


public class code {
    public static void main(String[] args) {
        car obj = new upgratedwaganor();
        // can not crteate the method of abstract class create the class that doesnot have the abstract method that will extends 
        obj.drive();
        obj.fly();
        obj.playmusic();
    }
}
