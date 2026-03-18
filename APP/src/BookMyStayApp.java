class Room {
    int roomId;
    String type;
    boolean isAvailable;

    Room(int roomId, String type, boolean isAvailable) {
        this.roomId = roomId;
        this.type = type;
        this.isAvailable = isAvailable;
    }
}

public class BookMyStayApp {
    public static void main(String[] args) {

        Room[] rooms = {
                new Room(101, "Single", true),
                new Room(102, "Double", true),
                new Room(103, "Suite", false)
        };

        String requestType = "Double";
        boolean confirmed = false;

        System.out.println("Reservation Request for: " + requestType);

        for (Room r : rooms) {
            if (r.type.equalsIgnoreCase(requestType) && r.isAvailable) {

                r.isAvailable = false; // allocate room

                System.out.println("Reservation Confirmed!");
                System.out.println("Room Allocated: " + r.roomId);

                confirmed = true;
                break;
            }
        }

        if (!confirmed) {
            System.out.println("Reservation Failed - No rooms available");
        }
    }
}
