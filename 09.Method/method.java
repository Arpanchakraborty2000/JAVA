 class computer {
    public void playmusic(){
        System.out.println("Music is playing ");
    }
    public String getpain(int cost){
        if (cost >= 10){
            return "pen";
        }else{
            return "Nothing";
        }
    }
    
}

public class method {
    public static void main(String[] args) {
        
        computer obj =new computer();
        obj.playmusic();
        String str = obj.getpain(10);
        System.out.println(str);
    }
}
