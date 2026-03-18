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
                new Room(102, "Double", false),
                new Room(103, "Single", true),
                new Room(104, "Suite", true)
        };

        String searchType = "Single";

        System.out.println("Available " + searchType + " rooms:");

        for (Room r : rooms) {
            if (r.type.equalsIgnoreCase(searchType) && r.isAvailable) {
                System.out.println("Room ID: " + r.roomId);
            }
        }
    }
}
