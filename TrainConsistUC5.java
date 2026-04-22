import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistUC5 {

    public static void main(String[] args) {

        // LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // محاولة إضافة مكرر (duplicate)
        trainFormation.add("Sleeper"); // This will be ignored

        // Display formation
        System.out.println("Final Train Formation:");
        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}