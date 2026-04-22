class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            // Safety rule
            if (type.equalsIgnoreCase("Rectangular") && 
                cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException(
                    "Unsafe: Rectangular bogie cannot carry Petroleum"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned: " + type + " -> " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment process completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> " + (cargo != null ? cargo : "No Cargo");
    }
}

public class TrainConsistUC15 {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe case
        b1.assignCargo("Petroleum");

        // Unsafe case
        b2.assignCargo("Petroleum");

        // Another valid assignment
        b2.assignCargo("Coal");

        System.out.println("Final Status:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}