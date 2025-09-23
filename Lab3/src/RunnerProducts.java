public class RunnerProducts {
    public static void main(String[] args) {
        // Create a default product
        Products p1 = new Products();

        System.out.println("Initial Product:");
        p1.getProduct();
        p1.checkAvailability();
        System.out.println("Inventory Cost: $" + p1.inventoryCost());

        // Purchase more units
        p1.Purchase(10, 3.9f);
        System.out.println("\nAfter Purchase:");
        p1.getProduct();
        System.out.println("Inventory Cost: $" + p1.inventoryCost());

        // Sale of some units
        p1.Sale(5);
        System.out.println("\nAfter Sale:");
        p1.getProduct();
        System.out.println("Inventory Cost: $" + p1.inventoryCost());

        // Sale more than available
        p1.Sale(30); // Should display a warning message
        System.out.println("\nAfter Attempted Oversale:");
        p1.getProduct();
        System.out.println("Inventory Cost: $" + p1.inventoryCost());
        p1.checkAvailability();

        // Update product details
        p1.setProduct(345, "Juice", true, 20, "Packets", 2.40f);
        System.out.println("\nAfter Updating Product:");
        p1.getProduct();
        System.out.println("Inventory Cost: $" + p1.inventoryCost());
        p1.checkAvailability();
    }
}
