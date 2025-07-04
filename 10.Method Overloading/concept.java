class calculator {

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

}

public class concept {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int r = cal.add(10, 20);
        System.out.println(r);
        int s = cal.add(10, 20, 30);
        System.out.println(s);

    }
}
