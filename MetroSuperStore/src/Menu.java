import java.util.*;

public class Menu {
    private String id;
    Inventory inventory = new Inventory(100);
    public  void startMenu(){
        Scanner input = new Scanner(System.in);
        int menu = 0;
        System.out.println("Welcome to our Inventory Management System");
        while(menu > -1){
            System.out.println("Enter 1 to add any product\nEnter 2 to remove a product\nEnter 3 to search a product\nEnter 4 to generate Report\nEnter 5 to update price or update stock of a product\nEnter 6 to retrieve a product\nEnter 7 to generate Monthly Report\nEnter -1 to end the menu");
            try {
                menu = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid option.");
                input.nextLine();
                continue;
            }
            switch (menu){
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                case 5:
                    case5();
                    break;
                case 6:
                    case6();
                    break;
                case 7:
                    case7();
                    break;
                default:
                    if(menu == -1)
                        System.out.println("Thanks for using our Software\nVisit again Kindly");
                    else
                        System.out.println("Enter a valid option");
            }

        }
    }



    //all options:
    private void case1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to add a Laptop\nEnter 2 to add a Smartphone\nEnter 3 to add an AudioDevice\nEnter 4 to add seating\nEnter 5 to add a Table\nEnter 6 to add Groceries");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("product added: " + inventory.addProduct(Laptops.createLaptopFromUserInput()));
                break;
            case 2:
                System.out.println("product added: " + inventory.addProduct(Smartphones.createSmartphoneFromUserInput()));
                break;
            case 3:
                System.out.println("product added: " + inventory.addProduct(AudioDevices.createAudioDeviceFromUserInput()));
                break;
            case 4:
                System.out.println("product added: " + inventory.addProduct(Seatings.createSeatingFromUserInput()));
                break;
            case 5:
                System.out.println("product added: " + inventory.addProduct(Tables.createTableFromUserInput()));
                break;
            case 6:
                System.out.println("product added: " + inventory.addProduct(Groceries.createGroceryFromUserInput()));
                break;
            default:
                System.out.println("Choose valid options");
        }
    }
    private void case2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of the product which you want to remove:");
        id = input.next();
        System.out.println("Product removed: " + inventory.removeProduct(id));
    }
    private void case3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of the product which you want to search:");
        id = input.next();
        System.out.println(inventory.searchProduct(id));
    }
    private void case4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which Products Should I show?");
        System.out.println("Press 1 to show filtered products\nPress 2 to show all available products");
        int show = input.nextInt();
        switch (show){
            case 1:
                System.out.println("Tell me a minimum stock quantity of products which I should print:");
                int min = input.nextInt();
                inventory.displayList(min);
                break;
            case 2:
                inventory.displayList();
                break;
            default:
                System.out.println("Choose valid options");
        }
    }
    private void case5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the id of product which you want to update:");
        id = input.nextLine();
        System.out.println("Enter 1 to change price\nEnter 2 to change stockQuantity");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println("Enter new Price:");
                double price = input.nextDouble();
                System.out.println(inventory.updateProduct(id,price));
                break;
            case 2:
                System.out.println("Enter new stock Quantity");
                int stocks = input.nextInt();
                System.out.println(inventory.updateProduct(id,stocks));
                break;
            default:
                System.out.println("Choose a valid option");
        }
    }
    private void case6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of the product which you want to retrieve:");
        id = input.next();
        System.out.println(inventory.retrieveProduct(id));
    }
    private void case7(){
        inventory.displayMonthlyExpenses();
    }

}
