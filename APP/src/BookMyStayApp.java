public class BookMyStayApp {
    public static void main(String[] args) {

        String[] services = {"Breakfast", "WiFi", "Airport Pickup"};
        boolean[] selected = {true, false, true};

        int totalCost = 0;

        System.out.println("Selected Add-On Services:");

        for (int i = 0; i < services.length; i++) {
            if (selected[i]) {
                System.out.println(services[i]);

                // simple pricing
                if (services[i].equals("Breakfast")) totalCost += 200;
                if (services[i].equals("WiFi")) totalCost += 100;
                if (services[i].equals("Airport Pickup")) totalCost += 500;
            }
        }

        System.out.println("Total Add-On Cost: ₹" + totalCost);
    }
}
