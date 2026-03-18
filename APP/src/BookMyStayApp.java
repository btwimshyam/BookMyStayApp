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

        // Room list (sample data)
        Room[] rooms = {
                new Room(101, "Single", true),
                new Room(102, "Double", true),
                new Room(103, "Single", false),
                new Room(104, "Suite", true)
        };

        String requestType = "Single";
        boolean booked = false;

        System.out.println("Booking request for: " + requestType);

        // FCFS booking
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].type.equalsIgnoreCase(requestType) && rooms[i].isAvailable) {
                rooms[i].isAvailable = false; // book the room

                System.out.println("Booking Successful!");
                System.out.println("Allocated Room ID: " + rooms[i].roomId);

                booked = true;
                break; // First-Come-First-Serve → stop after first match
            }
        }

        if (!booked) {
            System.out.println("No rooms available for the requested type.");
        }
    }
}
