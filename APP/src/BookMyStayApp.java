import java.util.HashMap;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor to initialize room availability
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("SingleRoom", 10);
        inventory.put("DoubleRoom", 7);
        inventory.put("SuiteRoom", 3);
    }

    // Method to get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Method to update availability
    public void updateAvailability(String roomType, int count) {
        if (inventory.containsKey(roomType)) {
            inventory.put(roomType, count);
        } else {
            System.out.println("Room type not found.");
        }

    }

    // Display current inventory
    public void displayInventory() {
        System.out.println("=== Current Room Inventory ===");

        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " : " + inventory.get(roomType));
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        // Display inventory
        inventory.displayInventory();

        // Example update
        System.out.println("\nUpdating SingleRoom availability...\n");
        inventory.updateAvailability("SingleRoom", 8);

        // Display updated inventory
        inventory.displayInventory();
        System.out.println();
    }
}
