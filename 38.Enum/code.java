enum Human{
        man , women , boy, girl;
}

public class code {
    public static void main(String[] args) {
        Human[] h = Human.values();

        for (Human human : h) {
            System.out.println(human+ " : "+human.ordinal());
        }

    }
}
