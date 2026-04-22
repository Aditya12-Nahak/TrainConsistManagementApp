import java.util.Scanner;

public class TrainConsistUC20 {

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔴 Fail-fast check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        // Linear search (can be replaced with binary if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Example 1: Empty dataset (to trigger exception)
        String[] bogieIds = {};   // try also with data

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID " + key + " FOUND.");
            } else {
                System.out.println("Bogie ID " + key + " NOT FOUND.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}