
public class code {
    public static void main(String[] args) {

        int num = 7;
        Integer num1 = num; // autounboxing
        System.out.println(num1);

        // num is a primitive int.

        // num1 is an Integer object (wrapper class).

        // Java automatically converts the primitive int to an Integer → this is called
        // autoboxing.

        int num2 = num1; // auto-unboxing
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str); // it will convert the value String to int

        System.out.println(num3 * 3);
    }
}
