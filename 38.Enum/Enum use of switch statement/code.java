enum Human {
    man, women, boy, girl;
}

public class code {
    public static void main(String[] args) {
        Human h = Human.boy;

        switch (h) {
            case man:
                System.out.println("This is a man");
                break;
            case women:
                System.out.println("This is a women");
                break;
            case boy:
                System.out.println("This is a boy");
                break;

            default:
                System.out.println("This is a girl");
                break;
        }

    }
}
