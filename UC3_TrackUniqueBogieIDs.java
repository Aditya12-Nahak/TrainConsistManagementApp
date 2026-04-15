

import java.util.HashSet;

public class UC3_TrackUniqueBogieIDs {

    public static void main(String[] args) {

        // Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs in Train:");
        System.out.println(bogieIDs);
    }
}