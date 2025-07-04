class claculator {

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class normal_class {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 90;

        claculator cal = new claculator(); // object creation
        int result = cal.add(num1, num2);
        System.out.println(result);

    }
}
