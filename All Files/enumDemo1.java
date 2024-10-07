enum Laptop{
    HP(800), Dell(700), Mac, Lenovo(900);

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In laptop : " + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class enumDemo1 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Dell;
        // System.out.println(lap + " : " + lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
    
}
