@FunctionalInterface
interface A {

    int add(int i, int j);
}

public class code {
    public static void main(String[] args) {
        A obj = (i, j) -> i + j; // lamda with retun funtion

        System.out.println(obj.add(10, 20));
    }
}
