
public class code {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        // j = 18/i; this will throw java.lang.ArithmeticException:

        try {
            j = 18 / i;
        } catch (Exception e) { // if the code have erron then only this will work 
            System.out.println("something went to wrong "+e);
        }

        System.out.println(j);
    }
}
