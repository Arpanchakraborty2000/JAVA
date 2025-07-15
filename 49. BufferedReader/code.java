import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.print("Enter your age: ");
        int age = 0;
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Hello " + name + ", age: " + age);
    }
}
