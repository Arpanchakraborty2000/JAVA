final class cal {   // its not getting and extends and you not change the value 

    public void show() {
        System.out.println("Arpan");
    }

    public void cal(int n1, int n2) {
        System.out.println(n1 + n2);
    }

}

// class adccal extends cal {
//     public void show() {
//         System.out.println("baban");
//     }

// }

public class code {
    public static void main(String[] args) {
        // final int n = 10;
        // n = 20;

        adccal obj = new adccal();
        obj.show();
        obj.cal(10, 20);

    }
}
