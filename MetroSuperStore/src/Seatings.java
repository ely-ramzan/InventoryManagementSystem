import java.util.*;
public class Seatings extends Furniture{
    private String loadCapacity;

    public Seatings(String productID, String name, Double price, int stockQuantity, double taxationSpecific, String material, String dimensions, String loadCapacity) {
        super(productID, name, price, stockQuantity, taxationSpecific, material, dimensions);
        this.loadCapacity = loadCapacity;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public static Seatings createSeatingFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter seating details:");
        System.out.print("Product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        double price = 0.0;
        int stockQuantity = 0;
        double taxationSpecific = 0.0;
        String material = null;
        String dimensions = null;
        String loadCapacity = null;

        try {
            System.out.print("Price: ");
            price = scanner.nextDouble();

            System.out.print("Stock Quantity: ");
            stockQuantity = scanner.nextInt();

            System.out.print("Taxation Specific: ");
            taxationSpecific = scanner.nextDouble();

            scanner.nextLine(); // to enter and store the String properly

            System.out.print("Material: ");
            material = scanner.nextLine();

            System.out.print("Dimensions: ");
            dimensions = scanner.nextLine();

            System.out.print("Load Capacity: ");
            loadCapacity = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return null;
        }

        return new Seatings(productID, name, price, stockQuantity, taxationSpecific, material, dimensions, loadCapacity);
    }


    @Override
    public String toString() {
        return "Seatings{" +
                "loadCapacity='" + loadCapacity + '\'' +
                ""+ super.toString()+ '}' ;
    }
}
