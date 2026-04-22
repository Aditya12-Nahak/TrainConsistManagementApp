import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistUC10 {

    public static void main(String[] args) {

        // Reuse bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 80));

        // Step 1: stream()
        // Step 2: map() -> extract capacity
        // Step 3: reduce() -> sum all capacities
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);

        // Optional: show original list unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);
    }
}