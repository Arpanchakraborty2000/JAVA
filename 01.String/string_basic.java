import java.util.Scanner;

public class string_basic {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // read full line
        //sc.next() only use the single word

        System.out.println("The name is : "+name);
    }
}
