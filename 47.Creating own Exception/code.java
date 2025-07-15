class ArpanException extends Exception { // creating my own exception

    public ArpanException(String s) {
        super(s);
    }

}

public class code {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        // j = 18/i; this will throw java.lang.ArithmeticException:

        try {
            j = 18 / i;
            if (j == 0) { // if the value 0 then this will throw the ArithmeticException
                throw new ArpanException("do not want ot print the value is zero"); // called own exception
            }
        } catch (ArpanException e) {
            j = 18 / 1; // it will forcefully change the value of i
            System.out.println("This is the default result " + e);
        } catch (Exception e) {
            System.out.println("something is went to wrong " + e);
        }

        System.out.println(j);
    }
}
