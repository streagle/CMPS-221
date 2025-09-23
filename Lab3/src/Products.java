public class Products {
    // Fields
    private int productID;
    private String productDescription;
    private boolean productAvailability;
    private int quantity;
    private String units;
    private float unitPrice;

    // Default constructor
    public Products() {
        productID = 123;
        productDescription = "Milk";
        productAvailability = true;
        quantity = 10;
        units = "Gallon";
        unitPrice = 4f;
    }

    // Parameterized constructor
    public Products(int ID, String desc, boolean available, int qty, String unit, float price) {
        productID = ID;
        productDescription = desc;
        productAvailability = available;
        quantity = qty;
        units = unit;
        unitPrice = price;
    }

    // Display product information
    public void getProduct() {
        System.out.println("\nProduct ID: " + productID);
        System.out.println("Product Description: " + productDescription);
        System.out.println("Product is available: " + productAvailability);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit/Scale: " + units);
        System.out.println("Unit Price: " + unitPrice);
    }

    // Update product information
    public void setProduct(int ID, String desc, boolean available, int qty, String unit, float price) {
        productID = ID;
        productDescription = desc;
        productAvailability = available;
        quantity = qty;
        units = unit;
        unitPrice = price;
    }

    // Process new purchase
    public void Purchase(int qty, float uprice) {
        productAvailability = true;
        unitPrice = (quantity * unitPrice + qty * uprice) / (quantity + qty);
        quantity += qty;
    }

    // Process sale with check for over-selling
    public void Sale(int qty) {
        if (qty > quantity) {
            System.out.println("\nCannot sell " + qty + " units. Only " + quantity + " available.");
            quantity = 0;
            productAvailability = false;
        } else {
            quantity -= qty;
            System.out.println("\nSold " + qty + " " + units + ".");
            if (quantity == 0) {
                productAvailability = false;
            }
        }
    }

    // Check availability
    public boolean checkAvailability() {
        return quantity > 0;
    }

    // Compute inventory cost
    public float inventoryCost() {
        return quantity * unitPrice;
    }
}
