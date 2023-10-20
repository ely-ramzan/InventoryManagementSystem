import java.util.*;
public class AudioDevices extends Electronics{
    public AudioDevices(String productID, String name, Double price, int stockQuantity, double taxationSpecific, int powerConsumption, double years) {
        super(productID, name, price, stockQuantity, taxationSpecific, powerConsumption, years);
    }
    public static AudioDevices createAudioDeviceFromUserInput() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter audio device details:");
            System.out.print("Product ID: ");
            String productID = scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            double price = 0.0;
            int stockQuantity = 0;
            double taxationSpecific = 0.0;
            int powerConsumption = 0;
            double years = 0.0;

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
            } catch (InputMismatchException e ){
                System.out.println("Invalid input type.Please enter valid input type");
                return null;
            }
        return new AudioDevices(productID, name, price, stockQuantity, taxationSpecific, powerConsumption, years);
    }

    @Override
    public String toString() {
        return "AudioDevices{}" + super.toString();
    }
}
