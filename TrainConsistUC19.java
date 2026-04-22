import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistUC19 {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int left = 0;
        int right = bogieIds.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int cmp = bogieIds[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        // Sorted bogie IDs (IMPORTANT for binary search)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // (Optional safety) ensure sorted
        Arrays.sort(bogieIds);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        boolean found = binarySearch(bogieIds, key);

        if (found) {
            System.out.println("Bogie ID " + key + " FOUND.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }

        sc.close();
    }
}