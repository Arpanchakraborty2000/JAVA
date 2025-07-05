class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

}

public class basic_concept {
    public static void main(String[] args) {
        Human obj1 = new Human();
        obj1.setAge(30);
        obj1.setName("Arpan");

        System.out.println(obj1.getName() + " : " + obj1.getAge() + " ");
    }
}
