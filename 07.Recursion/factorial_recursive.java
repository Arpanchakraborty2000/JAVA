public class factorial_recursive {
    static int fact(int n){
        if (n ==0 || n==1){
            return n;
        }else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial is : "+fact(4));



    }
}
