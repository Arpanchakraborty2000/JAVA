
class cal {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class advcal extends cal { // when this class same name funtion is avialable thats time it print his own
                           // class funtion ... but when its not avilable thsi time its search it another
                           // class and print this ....
    public int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

}

// int this case if we comment the advcal clss funtion that's time it will print
// call class funtion ... but when it avilable in advcal it will print his own
// ....

public class basic_concept {
    public static void main(String[] args) {
        advcal ad = new advcal();
        int p = ad.add(10, 20);
        System.out.println(p);
    }
}
