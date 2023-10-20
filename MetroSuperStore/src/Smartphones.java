import java.util.*;
public class Smartphones extends Electronics{
    private String OperatingSystem;
    private String Storage;
    private String Camera;

    public Smartphones(String productID, String name, Double price, int stockQuantity, double taxationSpecific, int powerConsumption, double years, String operatingSystem, String storage, String camera) {
        super(productID, name, price, stockQuantity, taxationSpecific, powerConsumption, years);
        OperatingSystem = operatingSystem;
        Storage = storage;
        Camera = camera;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        OperatingSystem = operatingSystem;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getCamera() {
        return Camera;
    }

    public void setCamera(String camera) {
        Camera = camera;
    }
    public static Smartphones createSmartphoneFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter smartphone details:");
        System.out.print("Product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        double price = 0.0;
        int stockQuantity = 0;
        double taxationSpecific = 0.0;
        int powerConsumption = 0;
        double years = 0.0;
        String operatingSystem = null;
        String storage = null;
        String camera = null;

        try {
            System.out.print("Price: ");
            price = scanner.nextDouble();

            System.out.print("Stock Quantity: ");
            stockQuantity = scanner.nextInt();

            System.out.print("Taxation Specific: ");
            taxationSpecific = scanner.nextDouble();

            System.out.print("Power Consumption: ");
            powerConsumption = scanner.nextInt();

            System.out.print("Warranty Years: ");
            years = scanner.nextDouble();

            scanner.nextLine(); // to use and store the String properly

            System.out.print("Operating System: ");
            operatingSystem = scanner.nextLine();

            System.out.print("Storage: ");
            storage = scanner.nextLine();

            System.out.print("Camera: ");
            camera = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return null;
        }

        return new Smartphones(productID, name, price, stockQuantity, taxationSpecific, powerConsumption, years, operatingSystem, storage, camera);
    }


    @Override
    public String toString() {
        return "Smartphones{" +
                "OperatingSystem='" + OperatingSystem + '\'' +
                ", Storage='" + Storage + '\'' +
                ", Camera='" + Camera + '\'' +
                "" +  super.toString() +
                '}';
    }
}
