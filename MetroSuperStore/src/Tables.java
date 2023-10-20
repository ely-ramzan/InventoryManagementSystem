import java.util.*;
public class Tables extends Furniture {
    private String shape;

    public Tables(String productID, String name, Double price, int stockQuantity, double taxationSpecific, String material, String dimensions, String shape) {
        super(productID, name, price, stockQuantity, taxationSpecific, material, dimensions);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public static Tables createTableFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter table details:");
        System.out.print("Product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        double price = 0.0;
        int stockQuantity = 0;
        double taxationSpecific = 0.0;
        String material = null;
        String dimensions = null;
        String shape = null;

        try {
            System.out.print("Price: ");
            price = scanner.nextDouble();

            System.out.print("Stock Quantity: ");
            stockQuantity = scanner.nextInt();

            System.out.print("Taxation Specific: ");
            taxationSpecific = scanner.nextDouble();

            scanner.nextLine(); // Consume the newline character

            System.out.print("Material: ");
            material = scanner.nextLine();

            System.out.print("Dimensions: ");
            dimensions = scanner.nextLine();

            System.out.print("Shape: ");
            shape = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return null;
        }

        return new Tables(productID, name, price, stockQuantity, taxationSpecific, material, dimensions, shape);
    }


    @Override
    public String toString() {
        return "Tables{" +
                "shape= " + shape + '\'' + "" +
                super.toString() +
                '}';

    }
}
