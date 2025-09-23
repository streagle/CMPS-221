public class HotDogStand {
    // Encapsulated instance variables
    private int standID;
    private int hotDogsSold;

    // Constructor to initialize values
    public HotDogStand(int standID, int hotDogsSold) {
        this.standID = standID;
        this.hotDogsSold = hotDogsSold;
    }

    // Method to increment hot dogs sold
    public void justSold() {
        hotDogsSold++;
    }

    // Getter methods
    public int getStandID() {
        return standID;
    }

    public int getHotDogsSold() {
        return hotDogsSold;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create three hot dog stands
        HotDogStand stand1 = new HotDogStand(1, 0);
        HotDogStand stand2 = new HotDogStand(2, 5);
        HotDogStand stand3 = new HotDogStand(3, 2);

        // Simulate sales
        stand1.justSold();
        stand1.justSold();
        stand2.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();

        // Display results
        System.out.println("Stand " + stand1.getStandID() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
        System.out.println("Stand " + stand2.getStandID() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
        System.out.println("Stand " + stand3.getStandID() + " sold " + stand3.getHotDogsSold() + " hot dogs.");
    }
}