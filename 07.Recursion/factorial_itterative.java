public class factorial_itterative {
    static int fact(int n){
        if (n ==0 || n==1){
            return n;
        }else {
            int result =1;
            for (int i = 1; i <=n ; i++) {
                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial is : " + fact(4));

    }
}
