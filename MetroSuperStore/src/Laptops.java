import java.util.*;

public class Laptops extends Electronics {
    private String processorType;
    private int RAM;
    private String screenDimensions;

    public Laptops(String productID, String name, Double price, int stockQuantity, double taxationSpecific, int powerConsumption, double years, String processorType, int RAM, String screenDimensions) {
        super(productID, name, price, stockQuantity, taxationSpecific, powerConsumption, years);
        this.processorType = processorType;
        this.RAM = RAM;
        this.screenDimensions = screenDimensions;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(String screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    public static Laptops createLaptopFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter laptop details:");
        System.out.print("Product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        double price = 0.0;
        int stockQuantity = 0;
        double taxationSpecific = 0.0;
        int powerConsumption = 0;
        double years = 0.0;
        String processorType = null;
        int RAM = 0;
        String screenDimensions = null;

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

            scanner.nextLine(); // to enter and store String Properly

            System.out.print("Processor Type: ");
            processorType = scanner.nextLine();

            System.out.print("RAM (in GB): ");
            RAM = scanner.nextInt();

            scanner.nextLine(); // to enter and store String Properly

            System.out.print("Screen Dimensions: ");
            screenDimensions = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return null;
        }

        return new Laptops(productID, name, price, stockQuantity, taxationSpecific, powerConsumption, years, processorType, RAM, screenDimensions);
    }


    @Override
    public String toString() {
        return "Laptops{" +
                "processorType='" + processorType + '\'' +
                ", RAM=" + RAM +
                ", screenDimensions='" + screenDimensions + '\'' +
                "" + super.toString() +
                '}';
    }
}