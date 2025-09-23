// Parent class
class Cup {
    protected String material;
    protected int capacity;   // in ml
    protected String liquidType;

    public Cup(String material, int capacity, String liquidType) {
        this.material = material;
        this.capacity = capacity;
        this.liquidType = liquidType;
    }

    public void fill(String liquidType) {
        this.liquidType = liquidType;
        System.out.println(material + " cup filled with " + liquidType);
    }

    public void drink() {
        System.out.println("Drinking " + liquidType + " from a " + material + " cup.");
    }

    // Overridden by subclasses
    public void displayInfo() {
        System.out.println("This is a " + material + " cup with capacity " + capacity + "ml.");
    }
}

// Child class 1
class PaperCup extends Cup {
    public PaperCup(int capacity, String liquidType) {
        super("Paper", capacity, liquidType);
    }

    @Override
    public void displayInfo() {
        System.out.println("Paper Cup - Not suitable for hot drinks. Capacity: " + capacity + "ml.");
    }
}

// Child class 2
class GlassCup extends Cup {
    public GlassCup(int capacity, String liquidType) {
        super("Glass", capacity, liquidType);
    }

    @Override
    public void displayInfo() {
        System.out.println("Glass Cup - Fragile but good for hot or cold drinks. Capacity: " + capacity + "ml.");
    }
}

// Child class 3
class CeramicCup extends Cup {
    public CeramicCup(int capacity, String liquidType) {
        super("Ceramic", capacity, liquidType);
    }

    @Override
    public void displayInfo() {
        System.out.println("Ceramic Cup - Microwave safe, perfect for hot drinks. Capacity: " + capacity + "ml.");
    }
}

// Runner class
public class RunnerCup {
    public static void main(String[] args) {
        PaperCup pc = new PaperCup(250, "Juice");
        GlassCup gc = new GlassCup(300, "Water");
        CeramicCup cc = new CeramicCup(350, "Tea");

        // Demonstrate polymorphism
        pc.displayInfo();
        gc.displayInfo();
        cc.displayInfo();

        System.out.println();

        // Using common methods
        pc.fill("Juice");
        pc.drink();

        gc.fill("Cold Coffee");
        gc.drink();

        cc.fill("Hot Tea");
        cc.drink();
    }
}