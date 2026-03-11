abstract class Room {
    int beds;
    int size;
    double price;

    Room(int beds, int size, double price) {
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    abstract void displayRoomDetails();
}

class SingleRoom extends Room {

    SingleRoom() {
        super(1, 200, 3000);
    }

    void displayRoomDetails() {
        System.out.println("Room Type: Single Room");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price: ₹" + price);
    }
}

class DoubleRoom extends Room {

    DoubleRoom() {
        super(2, 350, 5000);
    }

    void displayRoomDetails() {
        System.out.println("Room Type: Double Room");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price: ₹" + price);
    }
}

class SuiteRoom extends Room {

    SuiteRoom() {
        super(3, 500, 9000);
    }

    void displayRoomDetails() {
        System.out.println("Room Type: Suite Room");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price: ₹" + price);
    }
}

public class BookMyStayApp{

    public static void main(String[] args) {

        // Static availability variables
        int singleRoomAvailable = 10;
        int doubleRoomAvailable = 7;
        int suiteRoomAvailable = 3;

        // Room objects
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display details
        System.out.println("=== Room Details ===");

        single.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable);
        System.out.println();

        dbl.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable);
        System.out.println();

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable);
    }
}
