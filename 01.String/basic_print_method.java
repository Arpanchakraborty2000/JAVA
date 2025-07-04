public class basic_print_method {
    public static void main(String[] args) {

        int n =6;
        float c = 1.6789f;

        System.out.print("Print same line : "+n+ " / "+c);
        System.out.println();// bcz of 1 line gap
        System.out.println("Print different line : "+n+ " / "+c);
        System.out.printf("print with use of character : %d / %f",n,c);
        System.out.println();
        System.out.format("print with use of format : %d / %f",n,c);
    }
}
