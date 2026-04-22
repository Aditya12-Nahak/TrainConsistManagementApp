import java.util.Scanner;

public class TrainConsistUC18 {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {
        for (String id : bogieIds) {
            if (id.equals(key)) {   // proper string comparison
                return true;        // match found → stop early
            }
        }
        return false;               // no match found
    }

    public static void main(String[] args) {

        // Unsorted bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);

        // Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Output result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        sc.close();
    }
}