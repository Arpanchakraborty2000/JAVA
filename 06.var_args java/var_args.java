public class var_args {

    static int sum (int ...arr){
        // its store all element in a single array
        int result =0;
        for(int a:arr){
            result += a;

        }
        return result;
    }
    static int sum2 (int x,int ...arr){
        // at least one element should be declared
        int result =x;
        for(int a:arr){
            result += a;

        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("2 and 3 sum is : "+sum(2,3));
        System.out.println("2 and 3 and 4 sum is : "+sum(2,3,4));
        System.out.println("2 and 3 and 4 and 5 sum is : "+sum(2,3,4,5));

       // System.out.println("Empty array :"+sum2()); through an error
        System.out.println("One element : "+sum2(3)); // mandatory one element 
    }
}
