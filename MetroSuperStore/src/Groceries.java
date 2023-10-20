import java.util.*;
import java.text.*;
public class Groceries extends Products{
    private Date exp;
    private String NutritionalValue;

    public Groceries(String productID, String name, Double price, int stockQuantity, double taxationSpecific, Date exp, String nutritionalValue) {
        super(productID, name, price, stockQuantity, taxationSpecific);
        this.exp = exp;
        NutritionalValue = nutritionalValue;
    }

    public Date getExp() {
        return exp;
    }

    public void setExp(Date exp) {
        this.exp = exp;
    }

    public String getNutritionalValue() {
        return NutritionalValue;
    }

    public void setNutritionalValue(String nutritionalValue) {
        NutritionalValue = nutritionalValue;
    }
    public static Groceries createGroceryFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grocery details:");
        System.out.print("Product ID: ");
        String productID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        double price = 0.0;
        int stockQuantity = 0;
        double taxationSpecific = 0.0;
        Date exp = null;
        String nutritionalValue = null;

        try {
            System.out.print("Price: ");
            price = scanner.nextDouble();

            System.out.print("Stock Quantity: ");
            stockQuantity = scanner.nextInt();

            System.out.print("Taxation Specific: ");
            taxationSpecific = scanner.nextDouble();

            scanner.nextLine(); // to proper input the Strings

            System.out.print("Expiration Date (yyyy-MM-dd): ");
            String expDateString = scanner.nextLine();
            exp = new SimpleDateFormat("yyyy-MM-dd").parse(expDateString);

            System.out.print("Nutritional Value: ");
            nutritionalValue = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
            return null;
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
            return null;
        }

        return new Groceries(productID, name, price, stockQuantity, taxationSpecific, exp, nutritionalValue);
    }


    @Override
    public String toString() {
        return "Groceries{" +
                "exp=" + exp +
                ", NutritionalValue='" + NutritionalValue + '\'' + "" + super.toString() + '}';
    }
}

