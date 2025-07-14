enum Laptop {
    macbook(2000), thinkpad(1500), dell(), yoga(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.println("In laptop " + this.name());

    }

    private Laptop() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class code {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
